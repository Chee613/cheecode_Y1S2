import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryStoreSystem {
    private static final String INVENTORY_FILE = "inventory.txt";

    private final Scanner scanner;
    private final InventoryManager inventoryManager;
    private final CartList cart;
    private final LinkedListStack<CartAction> undoStack;

    public GroceryStoreSystem() {
        scanner = new Scanner(System.in);
        inventoryManager = new InventoryManager();
        cart = new CartList();
        undoStack = new LinkedListStack<>();
    }

    public static void main(String[] args) {
        GroceryStoreSystem system = new GroceryStoreSystem();
        system.run();
    }

    public void run() {
        loadInventory();

        boolean running = true;
        while (running) {
            displayMainMenu();
            int choice = readInt("Enter choice: ");
            System.out.println();

            switch (choice) {
                case 1:
                    inventoryManager.displayAll();
                    break;
                case 2:
                    searchProductById();
                    break;
                case 3:
                    searchProductByName();
                    break;
                case 4:
                    addNewProduct();
                    break;
                case 5:
                    removeProduct();
                    break;
                case 6:
                    updateStock();
                    break;
                case 7:
                    addItemToCart();
                    break;
                case 8:
                    cart.displayCart();
                    break;
                case 9:
                    manageCart();
                    break;
                case 10:
                    undoLastCartAddition();
                    break;
                case 11:
                    checkout();
                    break;
                case 12:
                    running = saveAndExit();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a menu option from 1 to 12.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    private void loadInventory() {
        try {
            inventoryManager.loadFromFile(INVENTORY_FILE);
            System.out.println("Inventory loaded successfully from inventory.txt.");
        } catch (IOException e) {
            System.out.println("Unable to load inventory.txt. Starting with an empty inventory.");
        }
        System.out.println();
    }

    private void displayMainMenu() {
        System.out.println("========== Grocery Store Management System ==========");
        System.out.println("1. Display all products");
        System.out.println("2. Search product by ID");
        System.out.println("3. Search product by name");
        System.out.println("4. Add new product");
        System.out.println("5. Remove product");
        System.out.println("6. Update stock");
        System.out.println("7. Add item to cart");
        System.out.println("8. View cart");
        System.out.println("9. Manage cart");
        System.out.println("10. Undo last cart addition");
        System.out.println("11. Checkout");
        System.out.println("12. Save and Exit");
    }

    private void searchProductById() {
        int id = readInt("Enter product ID: ");
        Product product = inventoryManager.searchById(id);

        if (product == null) {
            System.out.println("Product not found.");
        } else {
            System.out.println(product);
        }
    }

    private void searchProductByName() {
        String keyword = readNonEmptyString("Enter product name or keyword: ");
        ArrayList<Product> matches = inventoryManager.searchByName(keyword);

        if (matches.isEmpty()) {
            System.out.println("No products matched your search.");
            return;
        }

        System.out.println("Matching products:");
        System.out.println("==============================================================");
        System.out.printf("%-8s %-20s %-14s %-10s%n", "ID", "Name", "Price", "Stock");
        System.out.println("==============================================================");
        for (Product product : matches) {
            System.out.printf("%-8d %-20s RM%-12.2f %-10d%n",
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getStock());
        }
        System.out.println("==============================================================");
    }

    private void addNewProduct() {
        int id = readInt("Enter new product ID: ");
        if (inventoryManager.searchById(id) != null) {
            System.out.println("A product with that ID already exists.");
            return;
        }

        String name = readNonEmptyString("Enter product name: ");
        double price = readNonNegativeDouble("Enter product price: ");
        int stock = readNonNegativeInt("Enter product stock: ");

        Product product = new Product(id, name, price, stock);
        if (inventoryManager.addProduct(product)) {
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product could not be added.");
        }
    }

    private void removeProduct() {
        int id = readInt("Enter product ID to remove: ");
        if (cart.findItem(id) != null) {
            System.out.println("Cannot remove a product that is still in the cart.");
            return;
        }

        if (inventoryManager.removeProduct(id)) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private void updateStock() {
        int id = readInt("Enter product ID to update: ");
        Product product = inventoryManager.getProductById(id);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        int newStock = readNonNegativeInt("Enter new stock quantity: ");
        if (inventoryManager.updateStock(id, newStock)) {
            System.out.println("Stock updated successfully.");
        } else {
            System.out.println("Stock could not be updated.");
        }
    }

    private void addItemToCart() {
        int id = readInt("Enter product ID to add to cart: ");
        Product product = inventoryManager.getProductById(id);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        int quantity = readNonNegativeInt("Enter quantity: ");
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        if (!inventoryManager.isAvailable(id, quantity)) {
            System.out.println("Insufficient stock available.");
            return;
        }

        product.setStock(product.getStock() - quantity);
        cart.addItem(product, quantity);
        undoStack.push(new CartAction(id, quantity));
        System.out.println("Item added to cart successfully.");
    }

    private void manageCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        boolean managing = true;
        while (managing) {
            System.out.println("========== Manage Cart ==========");
            System.out.println("1. Remove item from cart");
            System.out.println("2. Update item quantity");
            System.out.println("3. Clear cart");
            System.out.println("4. Back to main menu");

            int choice = readInt("Enter choice: ");
            System.out.println();

            switch (choice) {
                case 1:
                    removeItemFromCart();
                    break;
                case 2:
                    updateCartItemQuantity();
                    break;
                case 3:
                    clearCartAndRestoreStock();
                    undoStack.clear();
                    break;
                case 4:
                    managing = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a menu option from 1 to 4.");
                    break;
            }

            System.out.println();
            if (cart.isEmpty()) {
                managing = false;
            }
        }
    }

    private void removeItemFromCart() {
        int id = readInt("Enter product ID to remove from cart: ");
        CartNode node = cart.findItem(id);

        if (node == null) {
            System.out.println("Item not found in cart.");
            return;
        }

        Product product = inventoryManager.getProductById(id);
        if (product != null) {
            product.setStock(product.getStock() + node.quantity);
        }

        cart.removeItem(id);
        System.out.println("Item removed from cart and stock restored.");
    }

    private void updateCartItemQuantity() {
        int id = readInt("Enter product ID to update in cart: ");
        CartNode node = cart.findItem(id);

        if (node == null) {
            System.out.println("Item not found in cart.");
            return;
        }

        int newQuantity = readNonNegativeInt("Enter new quantity (0 to remove item): ");

        if (newQuantity == 0) {
            Product product = inventoryManager.getProductById(id);
            if (product != null) {
                product.setStock(product.getStock() + node.quantity);
            }
            cart.removeItem(id);
            System.out.println("Item removed from cart and stock restored.");
            return;
        }

        int currentQuantity = node.quantity;
        Product product = inventoryManager.getProductById(id);
        int difference = newQuantity - currentQuantity;

        if (difference > 0) {
            if (!inventoryManager.isAvailable(id, difference)) {
                System.out.println("Insufficient stock available for that update.");
                return;
            }
            product.setStock(product.getStock() - difference);
        } else if (difference < 0) {
            product.setStock(product.getStock() + Math.abs(difference));
        }

        cart.updateQuantity(id, newQuantity);
        System.out.println("Cart quantity updated successfully.");
    }

    private void clearCartAndRestoreStock() {
        if (cart.isEmpty()) {
            System.out.println("Cart is already empty.");
            return;
        }

        CartNode current = cart.getHead();
        while (current != null) {
            Product product = inventoryManager.getProductById(current.product.getId());
            if (product != null) {
                product.setStock(product.getStock() + current.quantity);
            }
            current = current.next;
        }

        cart.clear();
        System.out.println("Cart cleared and stock restored.");
    }

    private void undoLastCartAddition() {
        CartAction lastAction = undoStack.pop();
        if (lastAction == null) {
            System.out.println("There is no cart addition to undo.");
            return;
        }

        CartNode node = cart.findItem(lastAction.getProductId());
        if (node == null) {
            System.out.println("Last added item is no longer in the cart. Nothing to undo.");
            return;
        }

        int quantityToUndo = Math.min(node.quantity, lastAction.getQuantityAdded());
        if (quantityToUndo <= 0) {
            System.out.println("There is no remaining quantity to undo.");
            return;
        }

        Product product = inventoryManager.getProductById(lastAction.getProductId());
        if (product != null) {
            product.setStock(product.getStock() + quantityToUndo);
        }

        if (node.quantity == quantityToUndo) {
            cart.removeItem(lastAction.getProductId());
        } else {
            cart.updateQuantity(lastAction.getProductId(), node.quantity - quantityToUndo);
        }

        System.out.println("Last cart addition undone successfully.");
    }

    private void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Nothing to checkout.");
            return;
        }

        System.out.println("========== BILL ==========");
        CartNode current = cart.getHead();
        while (current != null) {
            double subtotal = current.quantity * current.product.getPrice();
            System.out.printf("%-12s %3d x RM%-7.2f = RM%.2f%n",
                current.product.getName(),
                current.quantity,
                current.product.getPrice(),
                subtotal);
            current = current.next;
        }
        System.out.println();
        System.out.printf("Total: RM%.2f%n", cart.calculateTotal());
        System.out.println("==========================");

        cart.clear();
        undoStack.clear();

        String saveChoice = readNonEmptyString("Save inventory now? (Y/N): ");
        if (saveChoice.equalsIgnoreCase("Y")) {
            saveInventory();
        } else {
            System.out.println("Inventory changes remain in memory until you save and exit.");
        }
    }

    private boolean saveAndExit() {
        if (!cart.isEmpty()) {
            clearCartAndRestoreStock();
            undoStack.clear();
        }

        saveInventory();
        System.out.println("Exiting Grocery Store Management System.");
        return false;
    }

    private void saveInventory() {
        try {
            inventoryManager.saveToFile(INVENTORY_FILE);
            System.out.println("Inventory saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save inventory: " + e.getMessage());
        }
    }

    private int readInt(String prompt) {
        while (true) {
            String input = readLine(prompt);
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private int readNonNegativeInt(String prompt) {
        while (true) {
            int value = readInt(prompt);
            if (value >= 0) {
                return value;
            }
            System.out.println("Value cannot be negative.");
        }
    }

    private double readNonNegativeDouble(String prompt) {
        while (true) {
            String input = readLine(prompt);
            try {
                double value = Double.parseDouble(input);
                if (value < 0) {
                    System.out.println("Value cannot be negative.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private String readNonEmptyString(String prompt) {
        while (true) {
            String input = readLine(prompt);
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty.");
        }
    }

    private String readLine(String prompt) {
        System.out.print(prompt);
        if (!scanner.hasNextLine()) {
            System.out.println();
            System.out.println("Input ended. Exiting program.");
            System.exit(0);
        }
        return scanner.nextLine().trim();
    }
}
