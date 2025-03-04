
import java.util.Scanner;

public class lab1task9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        boolean iden_matrix = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((matrix[i][j] != 1 && i == j) || (matrix[i][j] != 0 && i != j)) {
                    iden_matrix = false;
                }
            }
        }
        iden_matrix = true;

        if (iden_matrix) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an identity matrix");
        }
    }
}
