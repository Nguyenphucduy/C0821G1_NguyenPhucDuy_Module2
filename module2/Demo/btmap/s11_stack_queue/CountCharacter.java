package s11_stack_queue;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "Ha noi ha";
        Map<String, Integer> myMap = new HashMap<>();
        String character;
        for (int i = 0; i < str.length(); i++) {
            //valueOf method dùng để chuyển đổi kiểu int, long... về String
            character = String.valueOf(str.charAt(i)).toLowerCase();
            if(myMap.containsKey(character)){
                //tang so lan len 1 don vi
                int currentValue = myMap.get(character); //lay value

                //cap nhat gia tri value cua 1 key trong map
                //myMap.replace(character, currentValue + 1);
                myMap.put(character, currentValue + 1);

            } else {
                // them moi ki tu do vao map, va gan so lan la 1
                myMap.put(character, 1);
            }
        }

        System.out.println(myMap);
    }
}
