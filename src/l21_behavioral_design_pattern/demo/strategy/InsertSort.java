package l21_behavioral_design_pattern.demo.strategy;

import java.util.List;

public class InsertSort implements SortStrategy {
    @Override
    public <T> void sort(List<T> items) {
        System.out.println(" InsertSort");
    }
}
