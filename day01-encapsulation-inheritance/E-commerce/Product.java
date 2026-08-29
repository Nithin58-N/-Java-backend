public class Product {
    protected String name;
    protected double price;
    protected int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public void setStock(int newStock) {
        if (newStock < 0) {
            System.out.println("Error: Stock cannot be negative.");
        } else {
            this.stock = newStock;
        }
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}