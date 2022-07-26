package Day3.Excercise;
import java.util.Scanner;
public class SumColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 0}, 
            {4, 5, 6, 9}, 
            {7, 2, 5, 5}
        };
        System.out.print("Enter the columns need sum :");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
            int total = 0;
            for(int row = 0; row < matrix.length; row++){
                total += matrix[row][k];
            }
            System.out.println("Sum for column " + k + " is " + total);
        
    }
}
