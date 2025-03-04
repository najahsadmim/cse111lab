
import java.util.Scanner;

public class lab1task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            boolean iscount=false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    iscount=true;
                }
            }
            if (!(iscount)){
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + "-" + count + " times");
            }
        }
    }
}
