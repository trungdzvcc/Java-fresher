package Ktth;
import java.util.Scanner;
import java.lang.*;

public class bai1 {
    public static double chuvi(double ch , double c1, double c2){
        return ch + c1 + c2;

    }
    public static double dientich( double c1, double c2){
        return (c1*c2)/2;

    }
    public static void main(String[] args){
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a : ");
        a = scanner.nextInt();
        System.out.print("\nNhap canh b : ");
        b = scanner.nextInt();
        System.out.print("\nNhap canh c : ");
        c = scanner.nextInt();
        int ch , c1,c2 ;
        // tim canh huyen
        if(a>b&&a>c){
            ch = a;
            c1=b;
            c2=c;
        }else if(b>c&&b>a){
            ch=b;
            c1=a;
            c2=c;
        }else{
            ch = c;
            c1=a;
            c2=b;
        }
        // kiem tra tam giac vuong bang pytago
        if(ch*ch==c1*c1+c2*c2){
            System.out.println("La tam giac vuong");
            System.out.println("Chu vi : " + chuvi(ch,c1,c2) );
            System.out.println("Dien tich : " + dientich(c1,c2) );
        }else{
            System.out.println("Khong phai la tam giac vuong");
        }


    }
}
