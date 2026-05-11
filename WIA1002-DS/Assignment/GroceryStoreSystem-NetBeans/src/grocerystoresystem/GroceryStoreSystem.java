package grocerystoresystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// Main class that ties inventory, cart, undo, and menu flow together.
public class GroceryStoreSystem {
    // Name of the inventory file used for loading and saving products.
    private static final String INVENTORY_FILE = "inventory.txt";

    // Scanner reads all keyboard input from the user.
    private final Scanner scanner;
    // Manages all inventory-related operations.
    private final InventoryManager inventoryManager;
    // Stores cart items inside the custom linked list.
    private final CartList cart;
    // Stores add-to-cart actions so they can be undone in LIFO order.
    private final LinkedListStack<CartAction> undoStack;

    public GroceryStoreSystem() {
        // Prepare the input reader for console usage.
        scanner = new Scanner(System.in);
        // Create the inventory manager used throughout the program.
        inventoryManager = new InventoryManager();
        // Create the shopping cart list.
        cart = new CartList();
        // Create the undo stack for cart additions.
        undoStack = new LinkedListStack<>();
    }

    public static void main(String[] args) {
        // Create the main system object.
        GroceryStoreSystem system = new GroceryStoreSystem();
        // Start the interactive menu loop.
        system.run();
    }

    public void run() {
        // Load products from file before the menu starts.
        loadInventory();

        // Keep looping until the user chooses to exit.
        boolean running = true;
        while (running) {
            // Show the main menu every cycle.
            displayMainMenu();
            // Read the user's selected menu option.
            int choice = readInt("Enter choice: ");
            System.out.println();

            // Send the user to the selected feature.
            switch (choice) {
                case 1:
                    // Show the full inventory table.
                    inventoryManager.displayAll();
                    break;
                case 2:
                    // Open the search submenu for ID or name searches.
                    searchProducts();
                    break;
                case 3:
                    // Add a new product into the inventory.
                    addNewProduct();
                    break;
                case 4:
                    // Remove a product from the inventory.
                    removeProduct();
                    break;
                case 5:
                    // Update the stock quantity of a product.
                    updateStock();
                    break;
                case 6:
                    // Save inventory without exiting the program.
                    saveInventory();
                    break;
                case 7:
                    // Add a product into the shopping cart.
                    addItemToCart();
                    break;
                case 8:
                    // Display all cart contents.
                    cart.displayCart();
                    break;
                case 9:
                    // Open the cart-management submenu.
                    manageCart();
                    break;
                case 10:
                    // Reverse the latest add-to-cart action.
                    undoLastCartAddition();
                    break;
                case 11:
                    // Generate the bill and finish checkout.
                    checkout();
                    break;
                case 12:
                    // Save data and stop the main loop.
                    running = saveAndExit();
                    break;
                default:
                    // Reject menu choices outside the valid range.
                    System.out.println("Invalid choice. Please select a menu option from 1 to 12.");
                    break;
            }

            // Leave a blank line between menu cycles for readability.
            System.out.println();
        }

        // Release the Scanner resource when the program ends.
        scanner.close();
    }

    private void loadInventory() {
        try {
            // Load products from the required inventory text file.
            inventoryManager.loadFromFile(INVENTORY_FILE);
            System.out.println("Inventory loaded successfully from inventory.txt.");
        } catch (IOException e) {
            // Fall back to an empty inventory if loading fails.
            System.out.println("Unable to load inventory.txt. Starting with an empty inventory.");
        }
        // Add spacing before the first menu appears.
        System.out.println();
    }

    private void displayMainMenu() {
        // Print the heading of the main menu.
        System.out.println("========== Grocery Store Management System ==========");
        // Print each menu option in order.
        System.out.println("1. Display all products");
        System.out.println("2. Search products");
        System.out.println("3. Add new product");
        System.out.println("4. Remove product");
        System.out.println("5. Update stock");
        System.out.println("6. Save inventory");
        System.out.println("7. Add item to cart");
        System.out.println("8. View cart");
        System.out.println("9. Manage cart");
        System.out.println("10. Undo last cart addition");
        System.out.println("11. Checkout");
        System.out.println("12. Save and Exit");
    }

    private void searchProducts() {
        // Keep the search submenu open until the user finishes searching.
        boolean searching = true;
        while (searching) {
            // Show the search options supported by the assignment.
            System.out.println("========== Search Products ==========");
            System.out.println("1. Search product by ID");
            System.out.println("2. Search product by name");
            System.out.println("3. Back to main menu");

            // Read the selected search option.
            int choice = readInt("Enter choice: ");
            System.out.println();

            // Route to the requested search behavior.
            switch (choice) {
                case 1:
                    searchProductById();
                    break;
                case 2:
                    searchProductByName();
                    break;
                case 3:
                    searching = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a menu option from 1 to 3.");
                    break;
            }

            if (searching) {
                System.out.println();
            }
        }
    }

    private void searchProductById() {
        // Ask the user for the target product ID.
        int id = readInt("Enter product ID: ");
        // Search the inventory for that ID.
        Product product = inventoryManager.searchById(id);

        // Show a message when no product matches the ID.
        if (product == null) {
            System.out.println("Product not found.");
        } else {
            // Print the matching product details.
            System.out.println(product);
        }
    }

    private void searchProductByName() {
        // Ask the user for a product name or partial keyword.
        String keyword = readNonEmptyString("Enter product name or keyword: ");
        // Search the inventory using case-insensitive partial matching.
        ArrayList<Product> matches = inventoryManager.searchByName(keyword);

        // Stop early when there are no matching products.
        if (matches.isEmpty()) {
            System.out.println("No products matched your search.");
            return;
        }

        // Print a heading before the search results.
        System.out.println("Matching products:");
        // Print the search result table header.
        System.out.println("==============================================================");
        System.out.printf("%-8s %-20s %-14s %-10s%n", "ID", "Name", "Price", "Stock");
        System.out.println("==============================================================");
        // Print one row for each matching product.
        for (Product product : matches) {
            System.out.printf("%-8d %-20s RM%-12.2f %-10d%n",
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getStock());
        }
        // Print the result table footer.
        System.out.println("==============================================================");
    }

    private void addNewProduct() {
        // Ask for the new product ID first.
        int id = readInt("Enter new product ID: ");
        // Reject duplicate IDs before asking for the rest of the fields.
        if (inventoryManager.searchById(id) != null) {
            System.out.println("A product with that ID already exists.");
            return;
        }

        // Ask for the remaining product details.
        String name = readNonEmptyString("Enter product name: ");
        double price = readNonNegativeDouble("Enter product price: ");
        int stock = readNonNegativeInt("Enter product stock: ");

        // Build the new Product object.
        Product product = new Product(id, name, price, stock);
        // Try to store the product in inventory.
        if (inventoryManager.addProduct(product)) {
            System.out.println("Product added successfully.");
        } else {
            System.out.println("Product could not be added.");
        }
    }

    private void removeProduct() {
        // Ask which product should be removed from inventory.
        int id = readInt("Enter product ID to remove: ");
        // Prevent removal when that product is still reserved in the cart.
        if (cart.findItem(id) != null) {
            System.out.println("Cannot remove a product that is still in the cart.");
            return;
        }

        // Attempt to remove the product from inventory.
        if (inventoryManager.removeProduct(id)) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private void updateStock() {
        // Ask which product should have its stock changed.
        int id = readInt("Enter product ID to update: ");
        // Retrieve the product from inventory.
        Product product = inventoryManager.getProductById(id);

        // Stop when the product does not exist.
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        // Prevent direct stock edits while the same product is temporarily reserved in the cart.
        if (cart.findItem(id) != null) {
            System.out.println("Cannot update stock for a product that is currently reserved in the cart.");
            return;
        }

        // Ask for the replacement stock value.
        int newStock = readNonNegativeInt("Enter new stock quantity: ");
        // Try to apply the new stock value.
        if (inventoryManager.updateStock(id, newStock)) {
            System.out.println("Stock updated successfully.");
        } else {
            System.out.println("Stock could not be updated.");
        }
    }

    private void addItemToCart() {
        // Ask which inventory product should be added to the cart.
        int id = readInt("Enter product ID to add to cart: ");
        // Retrieve the product object from inventory.
        Product product = inventoryManager.getProductById(id);

        // Stop when the product ID does not exist.
        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        // Ask how many units the customer wants.
        int quantity = readNonNegativeInt("Enter quantity: ");
        // Reject zero because cart quantities must be positive.
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        // Confirm that enough stock is available right now.
        if (!inventoryManager.isAvailable(id, quantity)) {
            System.out.println("Insufficient stock available.");
            return;
        }

        // Reserve the requested quantity by reducing inventory stock immediately.
        product.setStock(product.getStock() - quantity);
        // Store the reserved item inside the cart linked list.
        cart.addItem(product, quantity);
        // Push an undo record so this add action can be reversed later.
        undoStack.push(new CartAction(id, quantity));
        System.out.println("Item added to cart successfully.");
    }

    private void manageCart() {
        // Stop when there is nothing in the cart to manage.
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        // Keep showing the submenu until the user goes back or the cart becomes empty.
        boolean managing = true;
        while (managing) {
            // Print the cart-management submenu.
            System.out.println("========== Manage Cart ==========");
            System.out.println("1. Remove item from cart");
            System.out.println("2. Update item quantity");
            System.out.println("3. Clear cart");
            System.out.println("4. Back to main menu");

            // Read the chosen cart-management option.
            int choice = readInt("Enter choice: ");
            System.out.println();

            // Route the user to the selected cart action.
            switch (choice) {
                case 1:
                    // Remove a single cart item.
                    removeItemFromCart();
                    break;
                case 2:
                    // Change the quantity of one cart item.
                    updateCartItemQuantity();
                    break;
                case 3:
                    // Clear the entire cart and restore all reserved stock.
                    clearCartAndRestoreStock();
                    // Clear the undo history because the cart has been reset.
                    undoStack.clear();
                    break;
                case 4:
                    // Leave the cart-management submenu.
                    managing = false;
                    break;
                default:
                    // Reject submenu choices outside the valid range.
                    System.out.println("Invalid choice. Please select a menu option from 1 to 4.");
                    break;
            }

            // Add spacing before the next submenu display or return.
            System.out.println();
            // Automatically leave the submenu once the cart becomes empty.
            if (cart.isEmpty()) {
                managing = false;
            }
        }
    }

    private void removeItemFromCart() {
        // Ask which cart item should be removed.
        int id = readInt("Enter product ID to remove from cart: ");
        // Find the matching node inside the cart list.
        CartNode node = cart.findItem(id);

        // Stop when the product is not currently in the cart.
        if (node == null) {
            System.out.println("Item not found in cart.");
            return;
        }

        // Get the shared inventory product so its stock can be restored.
        Product product = inventoryManager.getProductById(id);
        if (product != null) {
            // Return the reserved quantity back into inventory.
            product.setStock(product.getStock() + node.quantity);
        }

        // Remove the item node from the cart linked list.
        cart.removeItem(id);
        System.out.println("Item removed from cart and stock restored.");
    }

    private void updateCartItemQuantity() {
        // Ask which cart item should be updated.
        int id = readInt("Enter product ID to update in cart: ");
        // Find the matching cart node.
        CartNode node = cart.findItem(id);

        // Stop when the product is not currently in the cart.
        if (node == null) {
            System.out.println("Item not found in cart.");
            return;
        }

        // Ask for the replacement quantity.
        int newQuantity = readNonNegativeInt("Enter new quantity (0 to remove item): ");

        // Treat zero as a request to remove the item completely.
        if (newQuantity == 0) {
            // Get the inventory product so stock can be restored.
            Product product = inventoryManager.getProductById(id);
            if (product != null) {
                // Return the full reserved quantity to inventory.
                product.setStock(product.getStock() + node.quantity);
            }
            // Remove the cart node after stock restoration.
            cart.removeItem(id);
            System.out.println("Item removed from cart and stock restored.");
            return;
        }

        // Capture the old quantity before applying changes.
        int currentQuantity = node.quantity;
        // Get the shared inventory product for stock adjustment.
        Product product = inventoryManager.getProductById(id);
        // Positive difference means more stock must be reserved.
        int difference = newQuantity - currentQuantity;

        if (difference > 0) {
            // Ensure enough inventory remains for the requested increase.
            if (!inventoryManager.isAvailable(id, difference)) {
                System.out.println("Insufficient stock available for that update.");
                return;
            }
            // Reserve the extra quantity from inventory.
            product.setStock(product.getStock() - difference);
        } else if (difference < 0) {
            // Return the reduced quantity back into inventory.
            product.setStock(product.getStock() + Math.abs(difference));
        }

        // Save the new quantity inside the cart node.
        cart.updateQuantity(id, newQuantity);
        System.out.println("Cart quantity updated successfully.");
    }

    private void clearCartAndRestoreStock() {
        // Stop when there is nothing left to clear.
        if (cart.isEmpty()) {
            System.out.println("Cart is already empty.");
            return;
        }

        // Begin traversing the linked list from the first cart node.
        CartNode current = cart.getHead();
        while (current != null) {
            // Find the shared inventory product for this cart line.
            Product product = inventoryManager.getProductById(current.product.getId());
            if (product != null) {
                // Return the reserved quantity back into inventory.
                product.setStock(product.getStock() + current.quantity);
            }
            // Move to the next cart node.
            current = current.next;
        }

        // Empty the linked list after all stock has been restored.
        cart.clear();
        System.out.println("Cart cleared and stock restored.");
    }

    private void undoLastCartAddition() {
        // Remove the newest add-to-cart action from the undo stack.
        CartAction lastAction = undoStack.pop();
        // Stop when there is no action to undo.
        if (lastAction == null) {
            System.out.println("There is no cart addition to undo.");
            return;
        }

        // Find the cart item referenced by that undo action.
        CartNode node = cart.findItem(lastAction.getProductId());
        // Stop when the item is already gone from the cart.
        if (node == null) {
            System.out.println("Last added item is no longer in the cart. Nothing to undo.");
            return;
        }

        // Undo only the quantity recorded by the last add action.
        int quantityToUndo = Math.min(node.quantity, lastAction.getQuantityAdded());
        // Stop when there is no remaining quantity to undo.
        if (quantityToUndo <= 0) {
            System.out.println("There is no remaining quantity to undo.");
            return;
        }

        // Restore the undone quantity back into inventory stock.
        Product product = inventoryManager.getProductById(lastAction.getProductId());
        if (product != null) {
            product.setStock(product.getStock() + quantityToUndo);
        }

        // Ask the cart list to reverse the quantity recorded in the undo action.
        if (!cart.undo(lastAction.getProductId(), quantityToUndo)) {
            System.out.println("Unable to update cart during undo.");
            return;
        }

        System.out.println("Last cart addition undone successfully.");
    }

    private void checkout() {
        // Stop when the cart has nothing to bill.
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Nothing to checkout.");
            return;
        }

        // Print the bill header.
        System.out.println("========== BILL ==========");
        // Begin traversing cart items for billing.
        CartNode current = cart.getHead();
        while (current != null) {
            // Calculate the subtotal for this bill line.
            double subtotal = current.quantity * current.product.getPrice();
            System.out.printf("%-12s %3d x RM%-7.2f = RM%.2f%n",
                current.product.getName(),
                current.quantity,
                current.product.getPrice(),
                subtotal);
            // Move to the next bill line.
            current = current.next;
        }
        // Separate line items from the final total.
        System.out.println();
        // Print the final total bill amount.
        System.out.printf("Total: RM%.2f%n", cart.calculateTotal());
        // Print the bill footer.
        System.out.println("==========================");

        // Clear the cart because checkout finalizes the purchase.
        cart.clear();
        // Clear undo history because the shopping session has ended.
        undoStack.clear();

        // Ask whether the user wants to write the updated inventory to file now.
        String saveChoice = readNonEmptyString("Save inventory now? (Y/N): ");
        if (saveChoice.equalsIgnoreCase("Y")) {
            // Save immediately when the user confirms.
            saveInventory();
        } else {
            // Keep the updated inventory only in memory for now.
            System.out.println("Inventory changes remain in memory until you save and exit.");
        }
    }

    private boolean saveAndExit() {
        // Restore temporary reservations when the user exits without checkout.
        if (!cart.isEmpty()) {
            clearCartAndRestoreStock();
            undoStack.clear();
        }

        // Persist the final inventory state to the text file.
        saveInventory();
        System.out.println("Exiting Grocery Store Management System.");
        // Return false so the main loop stops running.
        return false;
    }

    private void saveInventory() {
        try {
            // Write all inventory data back into the text file.
            inventoryManager.saveToFile(INVENTORY_FILE);
            System.out.println("Inventory saved successfully.");
        } catch (IOException e) {
            // Show the save error message when writing fails.
            System.out.println("Failed to save inventory: " + e.getMessage());
        }
    }

    private int readInt(String prompt) {
        // Keep reading until the user types a valid integer.
        while (true) {
            // Read one trimmed line from the console.
            String input = readLine(prompt);
            try {
                // Convert the typed text into an integer.
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                // Ask again when the input is not a whole number.
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private int readNonNegativeInt(String prompt) {
        // Keep reading until the user types a non-negative integer.
        while (true) {
            // Read one integer from the console.
            int value = readInt(prompt);
            if (value >= 0) {
                // Return valid non-negative values immediately.
                return value;
            }
            // Reject negative values and ask again.
            System.out.println("Value cannot be negative.");
        }
    }

    private double readNonNegativeDouble(String prompt) {
        // Keep reading until the user types a valid non-negative decimal number.
        while (true) {
            // Read one trimmed line from the console.
            String input = readLine(prompt);
            try {
                // Convert the typed text into a double value.
                double value = Double.parseDouble(input);
                if (value < 0) {
                    // Reject negative decimal values.
                    System.out.println("Value cannot be negative.");
                } else {
                    // Return valid non-negative decimal values.
                    return value;
                }
            } catch (NumberFormatException e) {
                // Ask again when the input is not a valid number.
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    private String readNonEmptyString(String prompt) {
        // Keep reading until the user types some non-empty text.
        while (true) {
            // Read one trimmed line from the console.
            String input = readLine(prompt);
            if (!input.isEmpty()) {
                // Return valid non-empty text immediately.
                return input;
            }
            // Reject blank input and ask again.
            System.out.println("Input cannot be empty.");
        }
    }

    private String readLine(String prompt) {
        // Show the prompt before reading input.
        System.out.print(prompt);
        // Exit cleanly when there is no more input available.
        if (!scanner.hasNextLine()) {
            System.out.println();
            System.out.println("Input ended. Exiting program.");
            System.exit(0);
        }
        // Read one line and trim extra spaces around it.
        return scanner.nextLine().trim();
    }
}
