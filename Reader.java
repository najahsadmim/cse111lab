
public class Reader {

    public String name = "New user";
    public int cap = 0;
    public String books[];
    public int count = 0;

    public String createReader(String name, int cap) {
        this.name = name;
        this.cap = cap;
        this.books = new String[cap];
        return "A new reader is created!";
    }

    public void addBook(String book) {
        if (count < cap) {
            books[count] = book;
            count++;
        } else {
            System.out.println("No more capacity");
        }
    }

    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + cap);
        System.out.println("Books: ");
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println("Book " + (i + 1) + ": " + books[i]);
            }
        } else {
            System.out.println("No books added yet");
        }
    }
}
