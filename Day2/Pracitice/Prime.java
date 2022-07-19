package Day2.Pracitice;
import java.util.*;

 class Prime{
    public static void main(String[] args){
        int n , count = 0;
        do{
            System.out.print("Enter number :" );
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if(n<=1){
                System.out.println(" you cannot enter less than or equal 1 ");
            }else{
                for(int i = 2; i <=Math.sqrt(n); i++){
                    if(n%i==0){
                         count++;
                    }
                }
            }  
        }while(n<=1);
               if(count>=1){
            System.out.println(n + " is a not prime number");
        }else{
            System.out.println(n + " is a prime number");
        }
    }
}