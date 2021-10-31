package ss19_solid.interface_segregation_principle.true_design;

public class Bird implements IBird, IAnimal {

    @Override
    public void fly() {
        System.out.println("Code phương thức fly của bird");
    }

    @Override
    public void run() {
        System.out.println("Code phương thức run của bird");
    }
}
