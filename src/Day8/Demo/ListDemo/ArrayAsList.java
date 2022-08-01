package Day8.Demo.ListDemo;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
    public static void main(String args[]) {
        // create new array
        String[] arr = { "Java", "C++", "PHP", "Python" };
        for (String s : arr) {
            System.out.println(s);
        }

        // convert array to List
        List<String> list = Arrays.asList(arr);
        // show list
        for (String s : list) {
            System.out.println(s);
        }
    }
}
