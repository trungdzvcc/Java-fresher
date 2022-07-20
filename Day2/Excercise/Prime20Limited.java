package Day2.Excercise;
import java.util.*;

public class Prime20Limited {
    public static void main(String[] args){
        int n;
        int stt = 1;
        do{
            System.out.print("Enter number of prime  : " );
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if(n<=1){
                System.out.println(" you cannot enter less than or equal 1 ");
            }else if(n>20){
                System.out.println(" you cannot enter more than 20 elements ");
            }else{
                for(int i =2 ; i <=100 ; i++){
                    int count = 0;
                    
                        for(int j = 2; j <=Math.sqrt(i); j++){
                            if(i%j==0){
                                 count++;
                            }
                        }
                    
                    if(count!=0){
                    }else{
                        System.out.println("Prime number " + stt +" = " + i);
                        stt++;
                        if(stt>n) break;
                    } 
                }
            }
        }while(n<=1||n>20);
    }
}
