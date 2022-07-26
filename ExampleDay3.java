
import java.util.Scanner;
public class ExampleDay3 {
    /**
     * @param args
     */
    public static void main(String[] args){
        int[][] matrix = new int[3][3];
        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
        matrix[0].length + " columns: ");

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() *100);
            }
        }
        
        System.out.println("Array just enter is: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }

        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }    
        }
        System.out.println("total all element : " + total);
        
        System.out.println("total column element : " );
        for (int column = 0; column < matrix[0].length; column++) {
            total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum for column " + column + " is "
            + total);
        }

        int maxRow = 0;
        int indexMaxRow = 0 ;
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
            for (int row = 1; row < matrix.length; row++){
                int totalThisRow = 0;
                for (column = 0; column < matrix[row].length; column++) {
                    totalThisRow += matrix[row][column];
                }
            if(maxRow<totalThisRow){
                maxRow = totalThisRow;
                indexMaxRow = row;   
            }
                
            }  
        }
        System.out.println("Row with the largest sum of elements : " + indexMaxRow + " and total row : " + maxRow );
        System.out.println("Arrays after shuffing : ");
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                int row1 = (int)(Math.random() * matrix.length);
                int column1 = (int)(Math.random() * matrix[row1].length);
                // swap
                int temp = matrix[row][column];
                matrix[row][column] = matrix[row1][column1];
                matrix[row1][column1] = temp;
            }
        }
        //print 
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    
    }
}