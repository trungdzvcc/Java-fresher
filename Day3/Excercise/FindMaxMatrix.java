package Day3.Excercise;
import java.util.Scanner;
public class FindMaxMatrix {

    public static void finMax(int[][]A,int m , int n){
         // assign max = a[0][0]
         int max = A[0][0];
         //compare
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 if (max < A[i][j]) {
                     //reassign
                     max = A[i][j];
                 }
             }
         }
              
         System.out.println("\nThe max element = " + max);

    }
    public static void main(String[] args) {
        int m, n;       
        Scanner scanner = new Scanner(System.in);   
        do{
            System.out.print("Enter the rows: ");
            m = scanner.nextInt();
            System.out.print("Enter the column:");
            n = scanner.nextInt();
            int A[][] = new int[m][n];
                 
            System.out.println("Matrix just enter:\n");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = (int) (Math.random() * 100);
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j] + "  ");
                }
                System.out.println();
               
              }
            finMax(A,m,n);

        }while(m<=0||n<=0);  
    }
}
