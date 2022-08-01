package Day8.Demo.Collection;

import java.util.*;

public class TestIterator {

    public static void main(String[] args){
        Collection collection = new ArrayList();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Collection collection2 = new ArrayList();
        collection2.add("Atlanta");
        collection2.add("Dallas");
        collection.retainAll(collection2);
        Iterator iterator = collection.iterator();
        // while loop
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next().toString().toUpperCase()+" / ");
//        }
        Iterator it ;
        for (it= iterator; it.hasNext(); ) {
            System.out.print(it.next().toString().toUpperCase() + "| ");

        }
   // System.out.print(collection.toString().toUpperCase());


      //  System.out.println(iterator.getClass().getSimpleName());
    }
}
