package review.review_week_3.abc_school_manage_student.model;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList <Student> {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> listStudent = new ArrayList<Student>();

    public StudentArrayList() {
    }

    /**
     * Phương thức thêm 1 đối tượng Student vào danh sách
     * @param student
     */
    public void listAdd(Student student){
        listStudent.add(student);
    }

    /**
     * Phương thức thêm 1 đối tượng Student bằng index
     * @param index
     * @param student
     */
    public void listAdd(int index,Student student){
        listStudent.add(index,student);
    }

    /**
     * Phương thức in danh sách ArrayList
     */

    public void listPrint(){
        System.out.println("Array List of your : ");
        System.out.println(listStudent);
    }

    /**
     * Phương thức xóa 1 đối tương Student bằng index
     * @param index
     * @return
     */
    public Student remove(int index){
        listStudent.remove(index);
        return (Student) listStudent;
    }
    public int size(){
        return listStudent.size();
    }

   

}
