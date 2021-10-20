package l11_map_and_tree.exercise.practice_arraylist_linkedlist.service;

import l11_map_and_tree.exercise.practice_arraylist_linkedlist.model.Product;

import java.util.Comparator;

public class SortProductByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {

        double result = o1.getPrice() - o2.getPrice();
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    }

}
