package l21_behavioral_design_pattern.practice.strategy.models;

import l21_behavioral_design_pattern.practice.strategy.service.SortStrategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
    private SortStrategy strategy;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(String name) {
        items.add(name);
    }

    public void sort() {
        strategy.sort(items);
    }
}
