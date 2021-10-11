package l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.model;

import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.service.Fruit;

public class Orange  extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
