package Day8.Excercise.Validate;

public class ValidateData {
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
}
