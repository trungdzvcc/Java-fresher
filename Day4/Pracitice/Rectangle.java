package Day4.Pracitice;

import java.util.Scanner;

class InfRectangle {

  double width;
  double height;

  public InfRectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return this.width * this.height;
  }

  public double getPerimeter() {
    return (this.width + this.height) * 2;
  }

  public String display() {
    return "Rectangle {" + "width=" + width + ", height=" + height + " }";
  }
}

public class Rectangle {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the width:");
    double width = scanner.nextDouble();
    System.out.print("Enter the height:");
    double height = scanner.nextDouble();
    InfRectangle rectangle = new InfRectangle(width, height);
    System.out.println("Your Rectangle \n" + rectangle.display());
    System.out.println(
      "Perimeter of the Rectangle: " + rectangle.getPerimeter()
    );
    System.out.println("Area of the Rectangle: " + rectangle.getArea());
  }
}
