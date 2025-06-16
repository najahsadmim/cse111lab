
public class Borrower {

    public String name;
    public String[] booksBorrowed;
    public int count = 0;
    public static int[] book_count = {3, 3, 3};
    public static String[] book_name = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};

    public static void bookStatus() {
        System.out.println("Available Books: ");
        for (int i = 0; i < book_name.length; i++) {
            System.out.println(book_name[i] + ": " + book_count[i]);
        }
    }

    public Borrower() {
    }

    public Borrower(String name) {
        this.name = name;
        booksBorrowed = new String[3];
    }

    public void borrowBook(String book) {
        boolean found = false;
        for (int i = 0; i < book_name.length; i++) {
            if (book == book_name[i]) {
                found = true;
                if (book_count[i] > 0) {
                    book_count[i]--;
                    booksBorrowed[count] = book;
                    count++;
                }
                else{
                    System.out.println("This book is not available.");
                }
            }
        }
        if (!found) {
            System.out.println("This book is not available");
        }

    }

    public void borrowerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Books Borrowed: ");
        for (int i = 0; i < count; i++) {
            System.out.println(booksBorrowed[i]);
        }

    }

    public static int remainingBooks(String book) {
        for (int i = 0; i < book_name.length; i++) {
            if (book == book_name[i]) {
                return book_count[i];
            }
        }
        return 0;
    }

}
