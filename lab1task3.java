
import java.util.Scanner;

public class lab1task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();
        String s3 = s1 + " " + s2;
        int sum = 0;

        for (int i = 0; i < s3.length(); i++) {
            char ch = s3.charAt(i);
            int asc = (int) ch;
            sum += asc;
        }
        System.out.println(s3);
        System.out.println(sum);
    }
}
