package Day2.Pracitice;
import java.util.*;
public class CalculatedInterest {

    public static void main(String[] args){
        double money ;
        double interestRate ;
        int month;
        double totalIntersetRate =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money : ");
        money = sc.nextDouble();
        System.out.print("Enter interset : ");
        interestRate = sc.nextDouble();
        System.out.print("Enter month :");
        month= sc.nextInt() ;
        for (int i=0;i<month;i++){
            totalIntersetRate += money * (interestRate/100)/12 * month ;
        }
        System.out.print("Total interset : " + totalIntersetRate);
        


    }
}

