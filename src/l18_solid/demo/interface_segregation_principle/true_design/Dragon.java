package l18_solid.demo.interface_segregation_principle.true_design;

public class Dragon implements IAnimal, IBird {


    @Override
    public void fly() {
        System.out.println("Code phương thức fly của Dragon");
    }

    @Override
    public void run() {
        System.out.println("Code phương thức run của Dragon");
    }
}
