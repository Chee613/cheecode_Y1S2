package grocerystoresystem;

// Custom singly linked list used to store shopping cart items.
public class CartList {
    // First node in the cart list.
    private CartNode head;
    // Last node in the cart list to support fast appends.
    private CartNode tail;
    // Number of distinct products currently stored in the cart.
    private int size;

    public void addItem(Product product, int quantity) {
        // Ignore invalid add requests.
        if (product == null || quantity <= 0) {
            return;
        }

        // Check whether this product is already in the cart.
        CartNode existingNode = findItem(product.getId());
        if (existingNode != null) {
            // Merge repeated adds by increasing the stored quantity.
            existingNode.quantity += quantity;
            return;
        }

        // Create a new cart node for a product not yet in the cart.
        CartNode newNode = new CartNode(product, quantity);
        // Handle the special case where the cart is empty.
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // Link the new node after the current tail.
            tail.next = newNode;
            // Move the tail reference to the new last node.
            tail = newNode;
        }

        // Count the new distinct cart item.
        size++;
    }

    public CartNode removeItem(int productId) {
        // Start scanning from the head of the list.
        CartNode current = head;
        // Track the previous node so links can be repaired on removal.
        CartNode previous = null;

        // Continue until the product is found or the list ends.
        while (current != null) {
            if (current.product.getId() == productId) {
                // When removing the head, move head to the next node.
                if (previous == null) {
                    head = current.next;
                } else {
                    // Otherwise bypass the removed node.
                    previous.next = current.next;
                }

                // Update the tail when the removed node was the last one.
                if (current == tail) {
                    tail = previous;
                }

                // Fully detach the removed node from the list.
                current.next = null;
                // Decrease the count of distinct cart items.
                size--;
                // Return the removed node so the caller can inspect it.
                return current;
            }

            // Move both pointers one node forward.
            previous = current;
            current = current.next;
        }

        // Return null when the requested product was not in the cart.
        return null;
    }

    public boolean updateQuantity(int productId, int newQty) {
        // Find the node whose quantity should be changed.
        CartNode node = findItem(productId);
        // Reject missing nodes or non-positive quantities.
        if (node == null || newQty <= 0) {
            return false;
        }

        // Save the new quantity in the node.
        node.quantity = newQty;
        // Report success to the caller.
        return true;
    }

    // Removes the last node in the list, allowing the list to behave like a stack when needed.
    public CartNode undo() {
        // Return null when there are no items to undo.
        if (isEmpty()) {
            return null;
        }

        // Remove the only node directly when the list has one item.
        if (head == tail) {
            CartNode removedNode = head;
            head = null;
            tail = null;
            size = 0;
            removedNode.next = null;
            return removedNode;
        }

        // Traverse until reaching the node just before the tail.
        CartNode current = head;
        while (current.next != tail) {
            current = current.next;
        }

        // Detach and return the old tail node.
        CartNode removedNode = tail;
        current.next = null;
        tail = current;
        size--;
        removedNode.next = null;
        return removedNode;
    }

    // Reverses part or all of a cart line using the quantity recorded by the undo stack.
    public boolean undo(int productId, int quantityToUndo) {
        // Find the matching cart item.
        CartNode node = findItem(productId);
        // Reject invalid undo requests.
        if (node == null || quantityToUndo <= 0 || quantityToUndo > node.quantity) {
            return false;
        }

        // Remove the whole node when the undone quantity equals the stored quantity.
        if (node.quantity == quantityToUndo) {
            removeItem(productId);
        } else {
            // Otherwise reduce only the quantity that was added in the last action.
            node.quantity -= quantityToUndo;
        }

        // Report a successful undo operation.
        return true;
    }

    public CartNode findItem(int productId) {
        // Start scanning from the first node in the cart.
        CartNode current = head;

        // Continue until a matching product ID is found or the list ends.
        while (current != null) {
            if (current.product.getId() == productId) {
                // Return the matching cart node.
                return current;
            }
            // Move to the next node in the linked list.
            current = current.next;
        }

        // Return null when the product does not exist in the cart.
        return null;
    }

    public void displayCart() {
        // Show a message when the cart has no items.
        if (isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        // Print the cart table header.
        System.out.println("======================================================================");
        System.out.printf("%-8s %-20s %-10s %-14s %-14s%n", "ID", "Name", "Qty", "Unit Price", "Subtotal");
        System.out.println("======================================================================");

        // Start printing from the first cart node.
        CartNode current = head;
        while (current != null) {
            // Calculate the subtotal for this cart line.
            double subtotal = current.quantity * current.product.getPrice();
            System.out.printf("%-8d %-20s %-10d RM%-12.2f RM%-12.2f%n",
                current.product.getId(),
                current.product.getName(),
                current.quantity,
                current.product.getPrice(),
                subtotal);
            // Move to the next cart node.
            current = current.next;
        }

        // Print the cart total and table footer.
        System.out.println("======================================================================");
        System.out.printf("Total: RM%.2f%n", calculateTotal());
        System.out.println("======================================================================");
    }

    public double calculateTotal() {
        // Start the running total at zero.
        double total = 0.0;
        // Begin scanning from the first cart node.
        CartNode current = head;

        // Add each cart line subtotal to the running total.
        while (current != null) {
            total += current.quantity * current.product.getPrice();
            // Move to the next cart node.
            current = current.next;
        }

        // Return the final bill amount.
        return total;
    }

    public void clear() {
        // Remove all node references so the list becomes empty.
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        // Return the number of distinct cart items.
        return size;
    }

    public boolean isEmpty() {
        // The cart is empty when its size is zero.
        return size == 0;
    }

    CartNode getHead() {
        // Expose the head node to internal package code that needs traversal.
        return head;
    }
}
