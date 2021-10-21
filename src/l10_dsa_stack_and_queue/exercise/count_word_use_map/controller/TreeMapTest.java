package l10_dsa_stack_and_queue.exercise.count_word_use_map.controller;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the words  of you : ");
        String string = scanner.nextLine();
        System.out.println("Before : --------------------------");
        System.out.println(string);
        System.out.println("After : ----------------------------");
        string = string.toLowerCase();

        String[] keyList = string.split(" ");
        for (int i = 0; i < keyList.length; i++) { // duyệt mảng .length
            if (map.containsKey(keyList[i])) { // Check Key có trong map hay không,contanskey check key có trong map ko
                int valueKey = map.get(keyList[i]);
                map.put(keyList[i], valueKey + 1);// add key và giá trị vào map
            } else {
                map.put(keyList[i], 1); // giá trị mặc định value = 1
            }
        }
        Set<String> strings = map.keySet();
        for (String string1 : strings) { // Duyệt key
            System.out.println(string1 + " " + map.get(string1)); // lấy key và value map.get(key)
        }
        // mỗi key - 1 value or 2 value nếu trùng
        //-----------------------------------------------------------Character
//        String str = "Ha noi ha";
//        Map<String, Integer> myMap = new HashMap<>();
//        String character;
//        for (int i = 0; i < str.length(); i++) {
//            //valueOf method dùng để chuyển đổi kiểu int, long... về String
//            character = String.valueOf(str.charAt(i)).toLowerCase();
//            if(myMap.containsKey(character)){
//                //tang so lan len 1 don vi
//                int currentValue = myMap.get(character); //lay value
//
//                //cap nhat gia tri value cua 1 key trong map
//                //myMap.replace(character, currentValue + 1);
//                myMap.put(character, currentValue + 1);
//
//            } else {
//                // them moi ki tu do vao map, va gan so lan la 1
//                myMap.put(character, 1);
//            }
//        }
//
//        System.out.println(myMap);
//    }
    }
}
