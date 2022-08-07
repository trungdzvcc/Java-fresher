package Day8.Excercise.Controller;

import Day8.Excercise.Model.Product;

import java.util.Comparator;

public class SortDescensePrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice()==o2.getPrice()){
            return 0;

        } else if (o1.getPrice()>o2.getPrice()) {
            return -1;

        } else {
            return 1;
        }
    }
}
