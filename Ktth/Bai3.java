package Ktth;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args){
        int counter;
        int max = 0;
        int number[] = new int[100];
        do {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the number of array: ");
          counter = scanner.nextInt();
          if (counter <= 0) {
            System.out.println("you must enter the number start to 1 ");
          } else if (counter > 20) {
            System.out.println("you must enter the number more than 20 ");
          } else {
            // enter
            for (int i = 0; i < counter; i++) {
              number[i] = (int) (Math.random() * 100);
            }
            //print
            System.out.println("Array just enter:");
            for (int i = 0; i < counter; i++) {
              System.out.print(number[i] + "  ");
            }
            max = number[0];
            // find max
            for (int i = 1; i < counter; i++) {
              if (max < number[i]) {
                max = number[i];
              }
            }
            System.out.println("\nmax value : " + max);
          }
        } while (counter <= 0 || counter > 20);
    }
    
}
