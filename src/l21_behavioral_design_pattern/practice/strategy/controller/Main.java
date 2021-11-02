package l21_behavioral_design_pattern.practice.strategy.controller;

import l21_behavioral_design_pattern.practice.strategy.models.MergeSort;
import l21_behavioral_design_pattern.practice.strategy.models.QuickSort;
import l21_behavioral_design_pattern.practice.strategy.models.SelectionSort;
import l21_behavioral_design_pattern.practice.strategy.models.SortedList;

public class Main {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Java");
        sortedList.add("PHP");
        sortedList.add("C#");
        sortedList.add("Python");

        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();

        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
        sortedList.setSortStrategy(new SelectionSort());
        sortedList.sort();
    }
}
