
import java.util.Scanner;

public class lab1task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newarr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            arr[i] = sc.nextInt();
        }
        int rmv=0;
        int idx=0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i-1]) {
                newarr[idx] = arr[i-1];
                idx++;
            }
            else{
                rmv++;
            }
        }
        newarr[idx]=arr[n-1];
        idx++;
        
        for (int i=0; i<idx; i++){
            if (newarr[i] != 0) {
                System.out.print(newarr[i] + " ");
            }
        }
        System.out.println();
        System.out.println(rmv + " elements removed ");
    }
}
