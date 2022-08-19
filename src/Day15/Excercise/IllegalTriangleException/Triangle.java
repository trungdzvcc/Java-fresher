package Day15.Excercise.IllegalTriangleException;

import java.util.Scanner;

public class Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        Check check = new Check();

        // Nhap du lieu
        try {
            System.out.print("Nhap vao canh thu nhat: ");
            int a = sc.nextInt();
            System.out.print("Nhap vao canh thu hai: ");
            int b = sc.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            int c = sc.nextInt();

            try {
                check.checkTriangleEdges(a, b, c);
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Sai: khong dung dinh dang!");
        }

        sc.close();
    }
}
