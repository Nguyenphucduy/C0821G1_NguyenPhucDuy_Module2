package review.review_week_3.abc_school_manage_student.controller;


import review.review_week_3.abc_school_manage_student.model.Student;
import review.review_week_3.abc_school_manage_student.model.StudentArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class StudentArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentArrayList<Student> arrayListStudent = new StudentArrayList<Student>();

        Student student2 = new Student("Bob2", 2, "Ha Noi", 10);
        Student student3 = new Student("Bob3", 3, "Ha Noi", 10);
        arrayListStudent.listAdd(student2);
//        arrayListStudent.listAdd(student3);
        int choose, quantity;
        do {
            System.out.println(" (Student Management) Please choose function : ");
            System.out.println("1. Add student");
            System.out.println("2. Edit student in Array List");
            System.out.println("3. Remove student in Array List");
            System.out.println("4. Check id student in Array List");
            System.out.println("5. Display information student in Array List ");
            System.out.println("6. Sort student with point ");
            System.out.println("7. OUT ");
            System.out.print("Enter choose : ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {

                case 1: {
                    do {
                        System.out.print("Enter the quantity you want add : ");
                        quantity = Integer.parseInt(scanner.nextLine());
                        if (quantity > 0) {
                            for (int i = 0; i < quantity; i++) {
                                System.out.println("Enter the information student : name,id,address,point");
                                System.out.print("Enter the name : ");
                                String name = scanner.nextLine();
                                System.out.print("Enter the id : ");
                                int id = Integer.parseInt(scanner.nextLine());
                                System.out.print("Enter the address : ");
                                String address = scanner.nextLine();
                                System.out.print("Enter the point : ");
                                int point = Integer.parseInt(scanner.nextLine());

                                Student student = new Student(name, id, address, point);
                                arrayListStudent.listAdd(student);
                            }
                        }
                    } while (quantity <= 0);
                    break;
                }
                case 2: {
                    int index;
                    System.out.print("Enter the index you want edit : ");

                    break;
                }
                case 3:
                    System.out.print("Enter the index you want remove : ");
                    int index = Integer.parseInt(scanner.nextLine());
                    arrayListStudent.remove(index);
                    break;

                case 4:
                    System.out.println("not done");
                    break;

                case 5:
                    arrayListStudent.listPrint();
                    break;

                case 6:
                    System.out.println("not done 2");
                    break;

                case 7:
                    System.exit(7);
                default:
                    System.out.println("No choice!");
            }
        } while (choose != 7);


    }
}
