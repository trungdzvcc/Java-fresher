package JavaCollection;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class Test {


    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");
        ArrayList<String> list = (ArrayList<String>) ((ArrayList<String>) arrayList).clone();

        System.out.println(list);
    }
}
