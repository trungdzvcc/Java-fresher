package Day3.Excercise;
import java.util.Scanner;
public class MergeArray {
    public static void input(int counter, int[] number) {
        for (int i = 0; i < counter; i++) {
          number[i] = (int) (Math.random() * 100);
        }
      }
    
      public static void output(int counter, int[] number) {
        for (int i = 0; i < counter; i++) {
          System.out.print(number[i] + "  ");
        }
      }
    public static void merge(int[] number1, int[] number2){
        int length = number1.length + number2.length;
        // length number 3 = number1 + number2 
        int[] number3 = new int[length];
        //index number 3
        int pos = 0;
        //add value from number1 into number3
        for(int element : number1) {
            number3[pos] = element;
            pos++;
          }
          //Continue with number2
          for(int element : number2) {
            number3[pos] = element;
            pos++;
          }
          System.out.println("\nArray after merge :");
          output(pos, number3);
             
    }
    public static void main(String[] args){
        int n1;
        int n2;
        boolean check = false;
    do {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of array 1: ");
      n1 = scanner.nextInt();
      if (n1 <= 0) {
        System.out.println("you must enter the number start to 1 ");
      } else if (n1 > 20) {
        System.out.println("you must enter the number more than 20 ");
      } else {
        check = true;
      }
      if (check) {
        System.out.print("Enter the number of array 2: ");
        n2 = scanner.nextInt();
        if (n2 <= 0) {
          System.out.println("you must enter the number start to 1 ");
        } else if (n2 > 20) {
          System.out.println("you must enter the number more than 20 ");
        } else {
        int[] number1 = new int[n1];
        int[] number2 = new int[n2];
             // enter   
        System.out.println("Enter array 1:");
        input(n1,number1);
        System.out.println("Enter array 2:");
        input(n2,number2);
        //print
        System.out.println("Array 1 just enter:");
        output(n1, number1);
        System.out.println("\nArray 2 just enter:");
        output(n2, number2);
        merge(number1, number2);
        }
      }  
    } while (n1 <= 0 || n1 > 20 );

    }
   
}
    

