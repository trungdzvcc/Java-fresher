package Day4.Excercise;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = sdf.format(date.getTime());
        System.out.println("time : " +time);

    }
    
}
