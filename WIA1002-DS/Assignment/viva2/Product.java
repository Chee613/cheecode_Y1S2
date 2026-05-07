// Represents a single grocery product stored in the inventory.
public class Product {
    // Unique product ID used to search and manage this item.
    private int id;
    // Display name of the product.
    private String name;
    // Selling price per unit.
    private double price;
    // Current available stock quantity.
    private int stock;

    public Product(int id, String name, double price, int stock) {
        // Save the provided product ID.
        this.id = id;
        // Save the provided product name.
        this.name = name;
        // Save the provided product price.
        this.price = price;
        // Save the provided starting stock.
        this.stock = stock;
    }

    public int getId() {
        // Return the current product ID.
        return id;
    }

    public void setId(int id) {
        // Replace the current product ID with a new one.
        this.id = id;
    }

    public String getName() {
        // Return the current product name.
        return name;
    }

    public void setName(String name) {
        // Replace the current product name.
        this.name = name;
    }

    public double getPrice() {
        // Return the current unit price.
        return price;
    }

    public void setPrice(double price) {
        // Replace the current unit price.
        this.price = price;
    }

    public int getStock() {
        // Return the current available stock.
        return stock;
    }

    public void setStock(int stock) {
        // Replace the current stock quantity.
        this.stock = stock;
    }

    @Override
    public String toString() {
        // Build a readable summary of the product for search results.
        return String.format("ID: %d, Name: %s, Price: RM%.2f, Stock: %d", id, name, price, stock);
    }
}
