import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class InventoryManager {
    private final ArrayList<Product> products;

    public InventoryManager() {
        products = new ArrayList<>();
    }

    public void loadFromFile(String filename) throws IOException {
        products.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",", 4);
                if (parts.length != 4) {
                    System.out.printf("Warning: Skipping malformed line %d in %s.%n", lineNumber, filename);
                    continue;
                }

                try {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double price = Double.parseDouble(parts[2].trim());
                    int stock = Integer.parseInt(parts[3].trim());

                    if (name.isEmpty() || price < 0 || stock < 0) {
                        System.out.printf("Warning: Skipping invalid line %d in %s.%n", lineNumber, filename);
                        continue;
                    }

                    if (!addProduct(new Product(id, name, price, stock))) {
                        System.out.printf("Warning: Duplicate product ID %d found on line %d.%n", id, lineNumber);
                    }
                } catch (NumberFormatException e) {
                    System.out.printf("Warning: Skipping malformed numeric values on line %d in %s.%n", lineNumber, filename);
                }
            }
        }
    }

    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Product product : products) {
                writer.write(String.format(Locale.US, "%d,%s,%.2f,%d",
                    product.getId(),
                    product.getName(),
                    product.getPrice(),
                    product.getStock()));
                writer.newLine();
            }
        }
    }

    public boolean addProduct(Product product) {
        if (product == null || searchById(product.getId()) != null) {
            return false;
        }

        products.add(product);
        return true;
    }

    public boolean removeProduct(int id) {
        Product product = searchById(id);
        if (product == null) {
            return false;
        }

        products.remove(product);
        return true;
    }

    public Product searchById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> searchByName(String keyword) {
        ArrayList<Product> matches = new ArrayList<>();
        String searchTerm = keyword.toLowerCase();

        for (Product product : products) {
            if (product.getName().toLowerCase().contains(searchTerm)) {
                matches.add(product);
            }
        }

        return matches;
    }

    public boolean updateStock(int id, int newStock) {
        Product product = searchById(id);
        if (product == null || newStock < 0) {
            return false;
        }

        product.setStock(newStock);
        return true;
    }

    public void displayAll() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("==============================================================");
        System.out.printf("%-8s %-20s %-14s %-10s%n", "ID", "Name", "Price", "Stock");
        System.out.println("==============================================================");
        for (Product product : products) {
            System.out.printf("%-8d %-20s RM%-12.2f %-10d%n",
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getStock());
        }
        System.out.println("==============================================================");
    }

    public Product getProductById(int id) {
        return searchById(id);
    }

    public boolean isAvailable(int id, int requestedQty) {
        Product product = searchById(id);
        return product != null && requestedQty > 0 && product.getStock() >= requestedQty;
    }
}
