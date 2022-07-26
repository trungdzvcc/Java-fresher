package Ktth;
import java.util.Scanner;
public class bai2 {
    public static int fibonacci(int n) {
        int f0 = n-1;
        int f1 = n-2;
        int fn = f0+f1;
        return fn;
    }
    public static void main(String[] args){
        int counter;
        do {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the number: ");
          counter = scanner.nextInt();
          if (counter <= 0) {
            System.out.println("you must enter the number start to 2 ");
          } else if (counter > 20) {
            System.out.println("you must enter the number more than 20 ");
          } else {
            //print
            int fbn = fibonacci(counter);
            System.out.println("Fibonacci : " + fbn);
        }
        } while (counter <= 2 || counter > 20);
    }
}
