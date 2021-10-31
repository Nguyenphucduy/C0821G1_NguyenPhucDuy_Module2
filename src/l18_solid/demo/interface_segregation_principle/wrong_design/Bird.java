package l18_solid.demo.interface_segregation_principle.wrong_design;

public class Bird implements IAnimal {

    @Override
    public void run() {
        System.out.println("Code phương thức run của bird");
    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {
        System.out.println("Code phương thức fly của bird");
    }
}
