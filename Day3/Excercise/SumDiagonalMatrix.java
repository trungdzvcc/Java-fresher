package Day3.Excercise;
import java.util.Scanner;
public class SumDiagonalMatrix {
    public static void main(String[] args){
    int n;  
    int sum = 0;
    Scanner scanner = new Scanner(System.in);
         
    System.out.print("Enter the number elment: ");
    n = scanner.nextInt();
    int A[][] = new int[n][n];
         
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            A[i][j] = (int) (Math.random() * 100);
        }
    }
         
    System.out.println("Matrix just entered:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");
    }
        // column = row is main diagonal
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            // check column vs row
            // equal then sum
            if (i == j) {
                sum += A[i][j];
            }
        }
    }
    System.out.println("Sum main diagonal of the matrix: " + sum);
  }
}
