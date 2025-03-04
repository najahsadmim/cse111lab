
import java.util.Scanner;

public class lab1task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter value 2: ");
        int n2 = sc.nextInt();

        if (n2 > n1) {
            int count = 0;
            for (int i = n1; i <= n2; i++) {
                boolean isprime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isprime = false;
                    }
                }
                if (isprime){
                    count++;
                }
            }
            System.out.println("There are " + count + " prime numbers between " + n1 + " and " + n2);
        }
        else{
            int count = 0;
            for (int i = n2; i <= n1; i++) {
                boolean isprime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isprime = false;
                    }
                }
                if (isprime){
                    count++;
                }
            }
            System.out.println("There are " + count + " prime numbers between " + n1 + " and " + n2);
        }
    }
}
