package Day12.Excercise.PhoneNumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String[] validPhone = new String[] {"(84)-(0978489646)","(84)-(0985456590)"};
    public static final String[] invalidphone = new String[] {"(a8)-(222222222)" ,"(ac)-(222222222)"};
    public static void main(String[] args){
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String phone: validPhone) {
            System.out.println(phone + "is valid phone number: " + phoneNumber.validate(phone) );
        }
        for (String phone: invalidphone) {
            System.out.println(phone + "is valid phone number: " + phoneNumber.validate(phone) );
        }
    }
}
