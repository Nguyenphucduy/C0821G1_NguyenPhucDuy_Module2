package s11_stack_queue;

import java.util.HashMap;
import java.util.Map;

public class CountStr {
    public static void main(String[] args) {
        String str = "Ha noi ha";
        String[] myArr = str.toLowerCase().split(" ");
//        System.out.println(Arrays.toString(myArr));
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < myArr.length; i++) {
            String key = myArr[i];
            if (myMap.containsKey(key)) {
                //tang so lan len 1 don vi
                int currentValue = myMap.get(key); //lay value //1

                //cap nhat gia tri value cua 1 key trong map
                //myMap.replace(character, currentValue + 1);
                myMap.put(key, currentValue + 1);

            } else {
                // them moi ki tu do vao map, va gan so lan la 1
                myMap.put(key, 1);
            }
            //ha 2
            //noi 1

        }

        System.out.println(myMap);
    }
}
