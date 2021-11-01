package l19_creational_design_patterns.practice.factory_method;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }
}
