package l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.model;

import l7_abstract_class_and_interface.practice.class_animal_and_interface_edible.service.Animal;

public  class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
}
