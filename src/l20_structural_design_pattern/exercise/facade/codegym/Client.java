package l20_structural_design_pattern.exercise.facade.codegym;

public class Client {
    public void printRandomEvenList(){
        RandomListFacade randomListFacade = new RandomListFacade(new RandomList(),new ListFilter(),new ListPrinter());
        randomListFacade.printRandomEvenList();
    }
}
