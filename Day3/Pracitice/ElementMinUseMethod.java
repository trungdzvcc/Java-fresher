package Day3.Pracitice;

import java.util.Scanner;

public class ElementMinUseMethod {

  public static void input(int counter, int[] number) {
    for (int i = 0; i < counter; i++) {
      number[i] = (int) (Math.random() * 100);
    }
  }

  public static void output(int counter, int[] number) {
    System.out.println("Array just enter:");
    for (int i = 0; i < counter; i++) {
      System.out.print(number[i] + "  ");
    }
  }

  public static void finMin(int min, int counter, int[] number) {
    min = number[0];
    for (int i = 1; i < counter; i++) {
      if (min > number[i]) {
        min = number[i];
      }
    }
    System.out.println("\nmin value : " + min);
  }

  public static void main(String[] args) {
    int counter;
    int min = 0;
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
        output(counter, number);
        // find min
        finMin(min, counter, number);
      }
    } while (counter <= 0 || counter > 20);
  }
}
