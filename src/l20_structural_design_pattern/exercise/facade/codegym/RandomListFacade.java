package l20_structural_design_pattern.exercise.facade.codegym;

import l20_structural_design_pattern.exercise.facade.codegym.ListFilter;
import l20_structural_design_pattern.exercise.facade.codegym.ListPrinter;
import l20_structural_design_pattern.exercise.facade.codegym.RandomList;
import l20_structural_design_pattern.exercise.facade.codegym.RandomNumber;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
    }

    public RandomListFacade(RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
    }

    public void printRandomEvenList(){
        this.listPrinter.printList(this.listFilter.filterOdd(this.randomList.generateList(10,1,10)));

    }

}
