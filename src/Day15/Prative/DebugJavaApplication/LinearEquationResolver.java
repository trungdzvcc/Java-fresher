package Day15.Prative.DebugJavaApplication;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args){
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a 8x +b =0' , please");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a");
        double a = scanner.nextDouble();
        System.out.println("b:");
        double b = scanner.nextDouble();
        if(a != b){
            double solution = -b/a;
        }
    }
}
