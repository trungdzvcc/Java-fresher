package Day3.Excercise;

import java.util.Scanner;

public class DeleteElementArray {

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

  public static int DelE(int counter, int[] number, Scanner scanner) {
    System.out.print("\nEnter delete element : ");
    int d = scanner.nextInt();
    int i = 0;
    int inew = i;
    //assign index of inew = i;
    for (; i < counter; i++) {
      // if not find duplicate element
      // assign value number[inew] = number[i] , inew++
      // if duplicate don't assign value for number[inew]
      if (number[i] != d) {
        number[inew] = number[i];
        inew++;
      }
    }
    //update array length
    counter = inew;
    //called output
    // Syste  m.out.println("Array after delete:");
    // output(counter, number);
    System.out.println("index method " + counter );
    return counter;
  }

  public static void main(String[] args) {
    int counter;
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
        input(counter, number);
        //print
        System.out.println("Array just enter:");
        output(counter, number);
        // del
        
        // output(counter, number);
        counter = DelE(counter, number, scanner);
        System.out.println("index method " + counter );
        output(counter, number);
      }
    } while (counter <= 0 || counter > 20);
  }
}
