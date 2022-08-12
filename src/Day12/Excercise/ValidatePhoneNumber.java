package Day12.Excercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args){
        String phoneNumber ;
        System.out.println("Enter phone Number : ");
        Scanner scanner = new Scanner(System.in);
        phoneNumber =scanner.nextLine();
        Pattern patternErea = Pattern.compile("\\d{2}$");
        Pattern pattern2 = Pattern.compile("\\d{10}$");
        while (true){
       //     String[] erea = phoneNumber.split(,2);

//            if(pattern.matcher(phoneNumber).matches()) {
//                System.out.print("Validity! ");
//            }else{
//                System.err.print("Phone Number[" + text1 + "] không đúng  định dạng ");
//            }
        }


    }
}
