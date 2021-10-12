package l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.model;

import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.service.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
