package Day3.Pracitice;

import java.util.Scanner;

public class CountStudentPass {

  public static void EnterPoint(int[] array, Scanner scanner) {
    int i = 0;
    while (i < array.length) {
      System.out.print("Enter a point for student " + (i + 1) + ": ");
      array[i] = scanner.nextInt();
      i++;
    }
  }
  public static void Output(int[] array) {
    int count = 0;
    System.out.print("List of point: ");
 for (int j = 0; j < array.length; j++) {
     System.out.print(array[j] + "\t");
     if (array[j] >= 5 && array[j] <= 10)
         count++;
 }
 System.out.print("\n The number of students passing exam : " + count);
  }

  public static void main(String[] args) {
    int size;
    int[] array;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Enter a size:");
      size = scanner.nextInt();
      if (size > 30){
        System.out.println("Size should not exceed 30");
      }else if(size <=0){
        System.out.println("Size should not less or equal to 0");
      }else{
        array = new int[size];
        EnterPoint(array,scanner);
        Output(array);
      }

    } while (size > 30);
  }
}
