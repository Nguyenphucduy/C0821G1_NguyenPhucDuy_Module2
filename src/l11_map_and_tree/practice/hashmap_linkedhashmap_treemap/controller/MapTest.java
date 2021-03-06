package l11_map_and_tree.practice.hashmap_linkedhashmap_treemap.controller;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
         //hashmap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap + "\n");
        //treemap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
//        System.out.println(treeMap);
        //LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
//        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
//        System.out.println(linkedHashMap);
        Set<String> strings = linkedHashMap.keySet();
        for (String string : strings){
            System.out.println( linkedHashMap.get(string));
        }

    }
}
