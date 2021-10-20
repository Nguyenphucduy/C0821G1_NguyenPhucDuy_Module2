package l10_dsa_stack_and_queue.exercise.count_char_use_map.controller;

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
        for (int i = 0; i < keyList.length; i++) {
            if (map.containsKey(keyList[i])) { // Check Key có trong map hay không
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
    }
}
