package s00_review;

import java.util.ArrayList;
import java.util.List;

public class StudentManage{
    private List<Student> studentList;

    public StudentManage(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudentManage() {
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void updateStudent(Student student){
        //kiem tra 'student' co ton tai trong list studentList
        int index = studentList.indexOf(student);

        if(index == -1){
            //'student' khong co trong list --> them 'student' vao list
            addStudent(student);
//            System.out.println("loi student khong ton tai..");
        } else {
            studentList.set(index, student);
        }
    }

    public void removeStudent(int index){
        if(index < 0 || index >= this.studentList.size()){
            System.out.println("Index not correct: "+index);
        } else {
            this.studentList.remove(index);
        }
    }


    public boolean isExist(Student student){
//        if(studentList.contains(student)){
//            return true;
//        } else {
//            return false;
//        }

        return studentList.contains(student);
//        for (Student element : studentList) {
//            if(element.equals(student)){
//                return true;
//            }
//        }
//        return false;
    }


    public Student getStudentInfo(int code){
        int index = studentList.indexOf(new Student(code));

        if(index == -1){
            return null;
        } else {
            return studentList.get(index);
        }
    }

}
