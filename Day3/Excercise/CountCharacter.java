package Day3.Excercise;

import java.util.Scanner;

public class CountCharacter {

  public static void main(String[] args) {
    String s1 = "Hello world ";
    char c;
    int count = 0;
    Scanner scanner = new Scanner(System.in);
    do{
        System.out.print("Enter the character: ");
        c = scanner.next().charAt(0);
        // loop
        for (int i = 0; i < s1.length(); i++) {
          // if character just entered equal character has been array
          // increase count
          if (s1.charAt(i) == c) {
            count++;
          }
        }
        System.out.println("Character " + c + " in String " + s1 + " = " + count);
    }while(65 <= c && c <= 90 || 97 <= c && c <= 122);
  }
}
