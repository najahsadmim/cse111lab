
public class Product {

    private String name = "Unknown";
    private double price;
    private int q;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }

    public void displayInfo(boolean qset) {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        if (qset) {
            System.out.println("Quantity: " + q);
        }
    }

    public void setQuantity(int q) {
        this.q = q;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return q;
    }
}
