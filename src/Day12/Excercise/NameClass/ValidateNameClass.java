package Day12.Excercise.NameClass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static void main(String[] args){
        System.out.println("Nhập mã lớp");
        String text1 ;
        Scanner scanner = new Scanner   (System.in);
        text1= scanner.nextLine();
        Pattern pattern = Pattern.compile("^[CAP]\\d{4}[GHIKLM]$");
        Matcher matcher = pattern.matcher(text1);
        if(matcher.matches()) {
            System.out.print("Thành công ");
        }else{
            System.out.print("Mã lớp [" + text1 + "] không đúng  định dạng ");
        }
    }
}
