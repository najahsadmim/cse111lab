//TASK 1

import java.util.Scanner;

public class lab1task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int min = 9999;
        int max = -9999;
        for (int i = 0; i < 9; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > 0 && num % 2 != 0) {
                sum += num;
                count++;
                if (count > 1) {
                    if (num > max) {
                        max = num;
                    } else if (num < min) {
                        min = num;
                    }
                } else {
                    max = num;
                    min = num;
                }
            } else {
                System.out.println("No positive odd numbers.");
            }
        }
        System.out.println("Sum= " + sum);
        System.out.println("Minimum= " + min);
        System.out.println("Maximum= " + max);
    }
}
