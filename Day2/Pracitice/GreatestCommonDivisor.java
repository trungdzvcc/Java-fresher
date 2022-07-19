package Day2.Pracitice;
import java.util.*;
public class GreatestCommonDivisor {

    public static int gcd(int a,int b){
        while (a*b != 0){ 
            if (a > b){
                a %= b;
            }else{
                b %= a;
            }
        }
        return a+b;
    }
    public static void main(String[] args){
        int a , b ,c ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        a = sc.nextInt();
        System.out.print("enter b : ");
        b = sc.nextInt();
        c= gcd(a,b) ;
        System.out.print(" Greatest common divisor : " + c);

    }
}

