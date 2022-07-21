package Day4.Excercise;

import java.util.*;

class Infor {

  private double a;
  private double b;
  private double c;

  public Infor(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public double getC() {
    return c;
  }

  public void setC(double c) {
    this.c = c;
  }

  public double getDiscriminant() {
    double delta = 0;
    delta = b * b - 4 * a * c;
    return delta;
  }

  public double getRoot1() {
    double root1;
    return root1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
  }

  public double getRoot2() {
    double root2;
    return root2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
  }

  public double getDulicateRoot() {
    double rootDulicate;
    rootDulicate = -b / (2 * a);
    return rootDulicate;
  }

  public void noSolution() {
    System.out.println("Delta < 0 \n=> Equation no solution");
  }
}

public class QuadraticEquation {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number a :");
    double a = scanner.nextDouble();
    System.out.print("Enter the number b :");
    double b = scanner.nextDouble();
    System.out.print("Enter the number c :");
    double c = scanner.nextDouble();
    Infor infor = new Infor(a, b, c);
    double DELTA = infor.getDiscriminant();
    System.out.println("\nDelta = " + DELTA);
    if (DELTA < 0) {
      infor.noSolution();
    } else if (DELTA == 0) {
      System.out.print(
        "\nDealta = 0 => \nDulicate root = " + infor.getDulicateRoot()
      );
    } else {
      System.out.print(
        "\n Dealta > 0 = > \nTwo root - Root 1 = " +
        infor.getRoot1() +
        " and Root 2 = " +
        (int) (infor.getRoot2())
      );
    }
  }
}
