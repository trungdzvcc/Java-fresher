package Day6.Excercise.Triangle;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double side1;
    double side2;
    double side3;
    double t2 = 0;

    do {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the side 1 : ");
      side1 = scanner.nextDouble();
      System.out.print("Enter the side 2 : ");
      side2 = scanner.nextDouble();
      System.out.print("Enter the side 3 : ");
      side3 = scanner.nextDouble();
      if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
        System.out.println("\nDont't enter < 0 \n");
      } else {
        Triangle t = new Triangle(side1, side2, side3);
        t2 = t.getPerimeter();

        if (t2 == 6) {
          System.out.println("\nDont't enter three values : 1 , 2 ,3 \n");
        } else {
          System.out.println(t);
          System.out.println("Perimeter of triangle: " + t2);
          System.out.println("Area of triangle: " + t.getArea());
        }
      }
    } while (side1 <= 0 || side2 <= 0 || side3 <= 0 || t2 == 6);
  }
}
