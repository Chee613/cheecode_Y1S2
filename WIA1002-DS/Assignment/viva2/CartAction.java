// Stores one cart-addition action so it can be undone later.
public class CartAction {
    // Product ID affected by the cart addition.
    private final int productId;
    // Quantity added during that action.
    private final int quantityAdded;

    public CartAction(int productId, int quantityAdded) {
        // Save the product ID for the undo record.
        this.productId = productId;
        // Save the quantity added for the undo record.
        this.quantityAdded = quantityAdded;
    }

    public int getProductId() {
        // Return the stored product ID.
        return productId;
    }

    public int getQuantityAdded() {
        // Return the stored added quantity.
        return quantityAdded;
    }
}
