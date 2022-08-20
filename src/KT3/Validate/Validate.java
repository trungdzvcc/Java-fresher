package KT3.Validate;

public class Validate {
    String message;
    public  boolean validateIntegerData(int n , int m) {
        if (n <= 0) {
            message = "Can't enter the number < 0";
            return false;
        } else if (n > m) {
            message = "Can't enter the number > " + m;
            return false;
        }else {
            return true;
        }
    }
    public void showmessage() {
        System.out.println(message);
    }
    public  boolean validateIntegerData(int n ) {
        if (n <= 0) {
            message = "Can't enter the number < 0";
            return false;
        }
        return true;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
