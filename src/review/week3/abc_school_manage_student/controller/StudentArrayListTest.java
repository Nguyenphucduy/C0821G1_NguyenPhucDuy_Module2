package review.week3.abc_school_manage_student.controller;


import review.week3.abc_school_manage_student.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class StudentArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> listStudent = new ArrayList<Student>();

        Student student2 = new Student("Bob2", 2, "Ha Noi", 9);
        Student student3 = new Student("Bob3", 3, "Ha Noi", 10);
        listStudent.add(student3);
        listStudent.add(student2);
        int choose;
        do {
            System.out.println(" (Student Management) Please choose function : ");
            System.out.println("1. Add student");
            System.out.println("2. Edit student in Array List");
            System.out.println("3. Remove student in Array List");
            System.out.println("4. Check id student in Array List and display student information ");
            System.out.println("5. Display information student in Array List ");
            System.out.println("6. Sort student with point ");
            System.out.println("7. OUT ");
            System.out.print("Enter choose : ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {

                case 1:
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
                    listStudent.add(student);

                    break;

                case 2: {
                    int index;
                    System.out.print("Enter the index you want edit : ");
                    index = Integer.parseInt(scanner.nextLine());
                    if (index >= 0 && index <= listStudent.size()) {
                        listStudent.remove(index);
                        System.out.println("Enter the information you want to edit");
                        System.out.print("Enter the name edit : ");
                        String nameFix = scanner.nextLine();
                        System.out.print("Enter the id edit: ");
                        int idFix = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter the address edit: ");
                        String addressFix = scanner.nextLine();
                        System.out.print("Enter the point edit: ");
                        int pointFix = Integer.parseInt(scanner.nextLine());
                        Student studentFix = new Student(nameFix, idFix, addressFix, pointFix);
                        listStudent.add(index, studentFix);
                        System.out.println("Your information is changed to");

                        break;
                    }
                }
                case 3:
                    System.out.print("Enter the index you want remove : ");
                    int indexRemove = Integer.parseInt(scanner.nextLine());
                    listStudent.remove(indexRemove);
                    break;

                case 4:
                    System.out.print("Enter the student id you want to check : ");
                    int idCheck = Integer.parseInt(scanner.nextLine());
                    boolean check = false;
                    for (int i = 0 ; i < listStudent.size() ; i++){
                        if (idCheck==listStudent.get(i).getId()){
                            idCheck = i;
                            check = true;
                        }else {
                            check = false;
                        }
                    }
                    if (check) {
                        System.out.println(" Have students with your id in the Array list is : " + listStudent.get(idCheck));
                    }else {
                        System.err.println("your id was not found in the array list");
                    }

                    break;
                case 5:
                    System.out.println("Array List of your : ");
                    System.out.println(listStudent);
                    break;

                case 6:
                    listStudent.sort(Comparator.comparingInt(Student::getPoint));
                    break;

                case 7:
                    System.exit(7);
                default:
                    System.out.println("No choice!");
            }
        }
        while (choose != 7);


    }
}
