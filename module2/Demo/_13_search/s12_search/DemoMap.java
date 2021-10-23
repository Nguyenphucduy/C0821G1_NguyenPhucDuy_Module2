package s12_search;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<Student, Integer> myMap = new HashMap<>();
        Student student1 = new Student(1, "Nguyen Van A", "DN", 9.0);
        Student student2 = new Student(2, "Nguyen Van B", "HCM", 9.0);
        Student student3 = new Student(3, "Nguyen Van C", "HN", 9.0);
        myMap.put(student1, 1);
        myMap.put(student2, 1);
        myMap.put(student3, 1);


//        Set<Student> keySet = myMap.keySet();
//        for(Student key: keySet){
//            System.out.println(key + " - " + myMap.get(key));
//        }
//        System.out.println(myMap);

        Iterator<Student> itr = myMap.keySet().iterator();
        while (itr.hasNext()){
            Student key = itr.next();
            System.out.println(key + " - " + myMap.get(key));
        }
    }
}
