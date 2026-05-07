import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

// Manages all inventory operations using an ArrayList of Product objects.
public class InventoryManager {
    // Dynamic array that stores every product currently in inventory.
    private final ArrayList<Product> products;

    public InventoryManager() {
        // Create the inventory list when the manager starts.
        products = new ArrayList<>();
    }

    public void loadFromFile(String filename) throws IOException {
        // Clear existing products so the file becomes the latest source of truth.
        products.clear();

        // Open the inventory file for reading line by line.
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Hold one raw line from the file at a time.
            String line;
            // Track the original line number for clearer warnings.
            int lineNumber = 0;

            // Continue until every line in the file has been read.
            while ((line = reader.readLine()) != null) {
                // Move to the next line number.
                lineNumber++;
                // Remove extra spaces around the raw line.
                line = line.trim();

                // Ignore blank lines so they do not break loading.
                if (line.isEmpty()) {
                    continue;
                }

                // Split one inventory row into ID, name, price, and stock.
                String[] parts = line.split(",", 4);
                // Skip rows that do not contain exactly four fields.
                if (parts.length != 4) {
                    System.out.printf("Warning: Skipping malformed line %d in %s.%n", lineNumber, filename);
                    continue;
                }

                try {
                    // Convert the first field into the product ID.
                    int id = Integer.parseInt(parts[0].trim());
                    // Read and trim the product name.
                    String name = parts[1].trim();
                    // Convert the third field into the product price.
                    double price = Double.parseDouble(parts[2].trim());
                    // Convert the fourth field into the stock quantity.
                    int stock = Integer.parseInt(parts[3].trim());

                    // Reject rows with missing names or negative numeric values.
                    if (name.isEmpty() || price < 0 || stock < 0) {
                        System.out.printf("Warning: Skipping invalid line %d in %s.%n", lineNumber, filename);
                        continue;
                    }

                    // Add the parsed product unless the ID already exists.
                    if (!addProduct(new Product(id, name, price, stock))) {
                        System.out.printf("Warning: Duplicate product ID %d found on line %d.%n", id, lineNumber);
                    }
                } catch (NumberFormatException e) {
                    // Skip rows whose numeric values cannot be parsed correctly.
                    System.out.printf("Warning: Skipping malformed numeric values on line %d in %s.%n", lineNumber, filename);
                }
            }
        }
    }

    public void saveToFile(String filename) throws IOException {
        // Open the inventory file for overwriting with the latest data.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Write every product in the required text-file format.
            for (Product product : products) {
                writer.write(String.format(Locale.US, "%d,%s,%.2f,%d",
                    product.getId(),
                    product.getName(),
                    product.getPrice(),
                    product.getStock()));
                // Move to a new line after each product record.
                writer.newLine();
            }
        }
    }

    public boolean addProduct(Product product) {
        // Reject null products or duplicate IDs.
        if (product == null || searchById(product.getId()) != null) {
            return false;
        }

        // Store the new product in the ArrayList.
        products.add(product);
        // Report success to the caller.
        return true;
    }

    public boolean removeProduct(int id) {
        // Find the product that matches the requested ID.
        Product product = searchById(id);
        // Fail when the product does not exist.
        if (product == null) {
            return false;
        }

        // Remove the matching product from the ArrayList.
        products.remove(product);
        // Report success to the caller.
        return true;
    }

    public Product searchById(int id) {
        // Check each product until a matching ID is found.
        for (Product product : products) {
            if (product.getId() == id) {
                // Return the first matching product.
                return product;
            }
        }
        // Return null when no product has the requested ID.
        return null;
    }

    public ArrayList<Product> searchByName(String keyword) {
        // Prepare a list for every matching product.
        ArrayList<Product> matches = new ArrayList<>();
        // Normalize the search keyword for case-insensitive matching.
        String searchTerm = keyword.toLowerCase();

        // Compare the keyword against each product name.
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(searchTerm)) {
                // Save products whose names contain the keyword.
                matches.add(product);
            }
        }

        // Return all matching products to the caller.
        return matches;
    }

    public boolean updateStock(int id, int newStock) {
        // Find the product whose stock should be changed.
        Product product = searchById(id);
        // Reject missing products or negative stock values.
        if (product == null || newStock < 0) {
            return false;
        }

        // Apply the new stock quantity.
        product.setStock(newStock);
        // Report success to the caller.
        return true;
    }

    public void displayAll() {
        // Show a message when there are no products to display.
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        // Print the inventory table header.
        System.out.println("==============================================================");
        System.out.printf("%-8s %-20s %-14s %-10s%n", "ID", "Name", "Price", "Stock");
        System.out.println("==============================================================");
        // Print one formatted row for each product.
        for (Product product : products) {
            System.out.printf("%-8d %-20s RM%-12.2f %-10d%n",
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getStock());
        }
        // Print the inventory table footer.
        System.out.println("==============================================================");
    }

    public Product getProductById(int id) {
        // Reuse the ID search method for cart-related lookups.
        return searchById(id);
    }

    public boolean isAvailable(int id, int requestedQty) {
        // Find the product whose stock should be checked.
        Product product = searchById(id);
        // Return true only when the product exists and has enough stock.
        return product != null && requestedQty > 0 && product.getStock() >= requestedQty;
    }
}
