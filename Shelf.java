
public class Shelf {

    public int capacity = 0;
    public int numbook = 0;

    public void showDetails() {
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + numbook);
    }

    public void addBooks(int num) {
        if (capacity == 0) {
            System.out.println("Zero capacity. Can not add books");
        } else if ((numbook + num) > capacity) {
            System.out.println("Exceeds capacity");
        } else {
            numbook += num;
            System.out.println(num + " books added to shelf");
        }
    }
}
