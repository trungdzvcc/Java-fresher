package Day2.Pracitice;
import java.util.*;
public class Menu {
    public static void main(String[] args){
        int choice  ;
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        switch (choice) {
            case 1:
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
            case 2:
                for (int i = 0; i <= 6 ; i++){
                    for (int j = 0; j<=6;j++){
                    System.out.print("*");
                }
                System.out.println("");  
                    
                }
                break;
            case 3:
                for (int i = 0; i <= 8 ; i++){
                    for (int j = 0; j<=6;j++){
                    System.out.print("*");
                    }
                System.out.println("");

                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
    
        }   
    }
}


