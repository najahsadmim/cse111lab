
public class Cart {

    public int cartno;
    public double itemprice[];
    public double discount;
    public String itemname[];
    public int count = 0;

    public void create_cart(int cartno) {
        this.cartno = cartno;
        this.itemprice = new double[3];
        this.itemname = new String[3];

    }

    public void addItem(String name, double price) {
        if (count < 3) {
            itemname[count] = name;
            itemprice[count] = price;
            System.out.println(name + " added to cart " + cartno);
            count++;
            System.out.println("You have " + count + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items in your cart now.");
        }
    }

    public void addItem(double price, String name) {
        addItem(name, price);
    }

    public void giveDiscount(double discount) {
        this.discount = discount;
    }

    public void cartDetails() {
        double totalp=0;
        System.out.println("Your cart (c" + cartno + ") :");
        for (int i = 0; i < count; i++) {
            System.out.println(itemname[i] + " - " + itemprice[i]);
            totalp += itemprice[i];
        }
        if (discount>0){
            totalp = totalp*(1-discount/100);
        }
        System.out.println("Discount Applied: " + discount);
        System.out.println("Total price: " + totalp);
    }

}
