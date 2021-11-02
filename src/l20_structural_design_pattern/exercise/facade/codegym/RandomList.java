package l20_structural_design_pattern.exercise.facade.codegym;

import java.util.ArrayList;
import java.util.List;

public class RandomList {
    public List<Integer> generateList(int size, int min, int max){
        List<Integer> integerList = new ArrayList<>();
        RandomNumber randomNumber = new RandomNumber();
        for (int i = 0; i < size; i++){
            int randomInteger = randomNumber.generateInteger(min, max);
            integerList.add(randomInteger);
        }
        return integerList;
    }
}