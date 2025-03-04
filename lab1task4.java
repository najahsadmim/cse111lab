
import java.util.Scanner;

public class lab1task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int asc = (int) ch;
            char newCh = (char) (asc - 1);
            s2 += newCh;
        }
        System.out.println(s2);
    }
}
