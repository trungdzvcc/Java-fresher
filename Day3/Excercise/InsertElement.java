package Day3.Excercise;
import java.util.Scanner;
public class InsertElement {
    public static void input(int counter, int[] number) {
        for (int i = 0; i < counter; i++) {
          number[i] = (int) (Math.random() * 100);
        }
      }
    
      public static void output(int counter, int[] number) {
        for (int i = 0; i < counter; i++) {
          System.out.print(number[i] + "  ");
        }
      }
    
      public static void  insertElement(int [] arr,  int k , int counter, int value) {
         int size = arr.length;
         //check element number is overcome array size
        if(counter == size) {
            System.out.println("Don't insert element because array is full ");
        }
        //if array is not full , shift one more element to insert
        counter++;
        // loop from last array to index k
        for(int i = counter-1; i > k; i--) {
            // move array down 1 element
                arr[i] =arr[i-1];
        }
        //insert into index k
        arr[k]=value;
        System.out.println("Array after insert:");
        output(counter, arr);
    }
     
    public static void main(String[] args){
        int counter;
        int value ;
        int k;
    int number[] = new int[100];
    
    do {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of array: ");
      counter = scanner.nextInt();
      if (counter <= 0) {
        System.out.println("you must enter the number start to 1 ");
      } else if (counter > 20) {
        System.out.println("you must enter the number more than 20 ");
      } else {
        // enter
        input(counter, number);
        //print
        System.out.println("Array just enter:");
        output(counter, number);
        // insert
        System.out.print("\nEnter the insert index : ");
         k = scanner.nextInt();
         System.out.print("\nEnter value of the element :  ");
          value = scanner.nextInt();   
        insertElement(number, k , counter, value);
      }
    } while (counter <= 0 || counter > 20);
    }
    
}
