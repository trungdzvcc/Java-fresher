package Day2.Excercise;
import java.util.*;

public class PrimesLessThan100 {
    public static void main(String[] args){  
             System.out.println("Prime numbers less than 100 : " );
                int stt = 1;
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
                    }
                }
            
    }
}
