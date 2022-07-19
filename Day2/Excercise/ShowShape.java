package Day2.Excercise;
import java.util.*;

public class ShowShape {
    public static void main(String[] args){
        int choice  ;
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle 4 case");
        System.out.println("3. Draw  isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 3 ; i++){
                    for (int j = 0; j<=6;j++){
                         System.out.print("*");
                    }
                System.out.println("");
                }
                break;
            case 2:
                
                System.out.println("Draw the square triangle botton-left"); 
                    for (int i = 1; i <= 6 ; i++){
                        for (int j = 1; j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");                     
                }
                System.out.println("Draw the square triangle top-left"); 
                    for (int i = 7; i >=1 ; i--){
                        for (int j = 1; j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");                     
                }

                System.out.println("Draw the square triangle botton-right");  
                    for (int i = 1; i <= 6; i++) { 
                        for (int j = 6; j >= i; j--) { 
                            System.out.print(" "); 
                        } 
                        for (int j = 1; j <= i; j++) { 
                            System.out.print("*"); 
                        } 
                        System.out.println();    
                    }

                
                    System.out.println("Draw the square triangle top-right");  
                    for (int i = 0; i <= 6; i++) { 
                        for (int j = 0; j <= i; j++) { 
                            System.out.print(" "); 
                        } 
                        for (int j = 6; j >= i; j--) { 
                            System.out.print("*"); 
                        } 
                        System.out.println();    
                    }
                    break;
            case 3:
                    System.out.println("Draw the isosceles triangle");  
                    for (int i = 1; i <= 6; i++) { 
                        for (int j = 6; j >= i; j--) { 
                            System.out.print(" "); 
                        } 
                        for (int j = 1; j <= i; j++) { 
                            System.out.print("* "); 
                        } 
                        System.out.println();    
                    }
                    break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice!");
    
        }   
    }        
}
