package ss19_solid.interface_segregation_principle.wrong_design;


public class Dog implements IAnimal {
    @Override
    public void run() {
        System.out.println("code phương thức run của dog");
    }

    @Override
    public void swim() {
        System.out.println("code phương thức swim của dog");
    }

    @Override
    public void fly() {

    }
    //dư thừa

}
