package l20_structural_design_pattern.exercise.facade.codegym;

import java.util.List;

public class ListPrinter {
    public void printList(List<Integer> numbers){
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}