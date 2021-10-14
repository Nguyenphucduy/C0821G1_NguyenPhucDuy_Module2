package l9_dsa_list.exercise.method_linkedlist.controller;

import l9_dsa_list.exercise.method_arraylist.controller.MyArrayListTest;
import l9_dsa_list.exercise.method_linkedlist.model.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;

            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Bob1");
        Student student2 = new Student(2,"Bob2");
        Student student3 = new Student(3,"Bob3");
        Student student4 = new Student(4,"Bob4");
        Student student5 = new Student(5,"Bob5");
        Student student6 = new Student(6,"Bob6");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
//        myLinkedList.addLast(student3);
        myLinkedList.addFirst(student4);
        myLinkedList.addFirst(student5);
//        myLinkedList.add(2,student4);
//        myLinkedList.remove(3);
//        myLinkedList.remove(student5);
//        System.out.println(myLinkedList.constrains(student6));
        System.out.println(myLinkedList.indexOf(student6));
//        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
//        for (int i = 0; i < cloneLinkedList.size();i++){
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }

//        for (int i = 0; i < myLinkedList.size();i++){
//            Student student = (Student) myLinkedList.get(i);
//            System.out.println(student.getName());
//        }
    }
}
