public class CartList {
    private CartNode head;
    private CartNode tail;
    private int size;

    public void addItem(Product product, int quantity) {
        if (product == null || quantity <= 0) {
            return;
        }

        CartNode existingNode = findItem(product.getId());
        if (existingNode != null) {
            existingNode.quantity += quantity;
            return;
        }

        CartNode newNode = new CartNode(product, quantity);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public CartNode removeItem(int productId) {
        CartNode current = head;
        CartNode previous = null;

        while (current != null) {
            if (current.product.getId() == productId) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }

                if (current == tail) {
                    tail = previous;
                }

                current.next = null;
                size--;
                return current;
            }

            previous = current;
            current = current.next;
        }

        return null;
    }

    public boolean updateQuantity(int productId, int newQty) {
        CartNode node = findItem(productId);
        if (node == null || newQty <= 0) {
            return false;
        }

        node.quantity = newQty;
        return true;
    }

    public CartNode findItem(int productId) {
        CartNode current = head;

        while (current != null) {
            if (current.product.getId() == productId) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public void displayCart() {
        if (isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("======================================================================");
        System.out.printf("%-8s %-20s %-10s %-14s %-14s%n", "ID", "Name", "Qty", "Unit Price", "Subtotal");
        System.out.println("======================================================================");

        CartNode current = head;
        while (current != null) {
            double subtotal = current.quantity * current.product.getPrice();
            System.out.printf("%-8d %-20s %-10d RM%-12.2f RM%-12.2f%n",
                current.product.getId(),
                current.product.getName(),
                current.quantity,
                current.product.getPrice(),
                subtotal);
            current = current.next;
        }

        System.out.println("======================================================================");
        System.out.printf("Total: RM%.2f%n", calculateTotal());
        System.out.println("======================================================================");
    }

    public double calculateTotal() {
        double total = 0.0;
        CartNode current = head;

        while (current != null) {
            total += current.quantity * current.product.getPrice();
            current = current.next;
        }

        return total;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    CartNode getHead() {
        return head;
    }
}
