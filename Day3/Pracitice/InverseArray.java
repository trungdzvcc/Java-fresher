package Day3.Pracitice;

import java.util.*;

public class InverseArray {

  public static void main(String[] args) {
    int counter;
    int i = 0;
    int j = 0;
    int temp;
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
        for (i = 0; i < counter; i++) {
          System.out.print("array[" + (i + 1) + "]: ");
          number[i] = scanner.nextInt();
        }
        // set j start last of array
        j = i - 1;
        // set i start head of array
        i = 0;
        scanner.close();
        //swap
        while (i < j) {
          temp = number[i];
          number[i] = number[j];
          number[j] = temp;
          i++;
          j--;
        }

        System.out.println("Array after inverse:");
        for (i = 0; i < counter; i++) {
          System.out.print(number[i] + "  ");
        }
      }
    } while (counter <= 0 || counter > 20);
  }
}
