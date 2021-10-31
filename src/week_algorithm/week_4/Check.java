package week_algorithm.week_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Check {
    boolean checkCharFrequency(int[] inputArray) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (map.containsKey(inputArray[i])) {
                int valueKey = map.get(inputArray[i]);
                map.put(inputArray[i], valueKey + 1);
            } else {
                map.put(inputArray[i], 1);
            }
        }
        Set<Integer> integers = map.keySet();
        for (int j = 1 ; j < integers.size(); j++)
            if (!map.get(inputArray[0]).equals(map.get(inputArray[j]))){
                return false;
            }
        return true;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 3, 1, 3, 1, 3,2};
        Check check = new Check();
        System.out.println(check.checkCharFrequency(ints));
    }
}


