package ss6_inheritance.controller;

import ss6_inheritance.model.Person;
import ss6_inheritance.model.Student;
import ss6_inheritance.model.Teacher;

public class MainController {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        student = student.getPerson();

        Person person = new Student(); //ép kiểu ngầm định.
        //Ép kiểu từ kiểu dữ liệu con -> cha.
        person = new Teacher();
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Teacher);

        Student student1 = new Student();
//        student1 = new Teacher();
        Teacher teacher = new Teacher();
        Student[] students = new Student[10];
        Teacher[] teachers = new Teacher[10];
        Person[] people = new Person[20];
        people[0] = new Student();
        people[1] = new Teacher();
        //Ép kiểu tường minh : ép từ cha -> con
        ((Student)people[0]).setPoint(8); //Chạy biên dịch -> chạy bên vùng nhớ stack
    for(Person person1: people) {
        //cách duyệt đúng
        if(person1 instanceof Student) {
            ((Student)person1).setPoint(8);
        }
        //cách duyệt sai vì không kiểm kiểu thực tế.
        ((Student)person1).setPoint(8);
    }
    }
}
