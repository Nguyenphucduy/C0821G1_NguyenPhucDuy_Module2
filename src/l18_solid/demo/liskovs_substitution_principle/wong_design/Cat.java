package l18_solid.demo.liskovs_substitution_principle.wong_design;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("meo meo");
    }
}
