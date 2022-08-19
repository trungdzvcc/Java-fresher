package Day15.Prative.NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();


        try{
            int y = new Integer("2");
            //numberformat_exception String input not number
            // int y = new Integer("two")
            System.out.println("gia tri y = " + y );
            CalculationExample calc = new CalculationExample();
            calc.calculate(x, y);

        }catch (NumberFormatException e){
            System.out.println("ngoai le " + e.getMessage());
        }
    }
    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (ArithmeticException e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }catch (NumberFormatException e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
        System.out.println("End");
    }
}
