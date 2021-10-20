package s00_review;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();

        studentManage.addStudent(new Student(1, "Nguyen A", "HCM", 8.5));
        studentManage.addStudent(new Student(2, "Nguyen B", "DN", 10));
        studentManage.addStudent(new Student(3, "Nguyen C", "HN", 11));
        studentManage.addStudent(new Student(4, "Nguyen C", "HN", 2));
        studentManage.addStudent(new Student(5, "Nguyen C", "HN", 9));

        int count = 0;
        for (Student student : studentManage.getStudentList()) {
            System.out.println(count++ + " : " +student);
        }

        System.out.println("Chon student can update");

        /*TH1 lay doi tuong co san trong List*/
//        Student student = studentManage.getStudentList().get(1);
//        System.out.println("Cap nhat ten");
//        student.setName("ten moi");
//        student.setAddress("dia chi moi");

        /*TH2 thong tin update nguoi dung tu tao*/
        Student student = new Student(3, "Nguyen X", "HN", 5.0);

        studentManage.updateStudent(student);
        studentManage.removeStudent(2);

        System.out.println("-----------------------");
        count = 0;
        for (Student element : studentManage.getStudentList()) {
            System.out.println(count++ + " : " +element);
        }

        System.out.println("Nhap ma sinh vien");
        int code = 1;
        System.out.println(studentManage.isExist(new Student(code)));

        Student student1 = studentManage.getStudentInfo(code);
        if(student1 == null){
            System.out.println("Ma SV khong hop le");
        } else {
            System.out.println(student1);
        }

        Collections.sort(studentManage.getStudentList(), new SortStudentByPoint());

        System.out.println("-----------------------");
        count = 0;
        for (Student element : studentManage.getStudentList()) {
            System.out.println(count++ + " : " +element);
        }
    }
}
