package l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.controller;

import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.model.Orange;
import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.model.Tiger;
import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.model.Animal;
import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.service.Edible;
import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.model.Fruit;
import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.model.Apple;
import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.model.Chicken;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
