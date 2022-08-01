package Day8.Demo.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListExample{
        public static void main(String args[]) {
            List<String> list = new ArrayList<String>();
            list.add("Java");
            list.add("C++");
            list.add("PHP");
            list.add(1, "Python");
            System.out.println("Phan tu co index = 2 la: " + list.get(2));
            // show list
            for (String s : list) {
                System.out.println(s);
            }
        }
}
