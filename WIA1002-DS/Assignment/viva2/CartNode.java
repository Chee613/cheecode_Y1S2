// One node in the custom singly linked list used for the shopping cart.
public class CartNode {
    // Reference to the product stored in this cart node.
    Product product;
    // Quantity of that product inside the cart.
    int quantity;
    // Link to the next node in the cart.
    CartNode next;

    public CartNode(Product product, int quantity) {
        // Store the product assigned to this node.
        this.product = product;
        // Store the quantity assigned to this node.
        this.quantity = quantity;
    }
}
