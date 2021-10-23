package review.week3.abc_school_manage_student.model;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private int id;
    private String address;
    private int point;

    public Student() {
    }

    public Student(String name, int id, String address, int point) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.point = point;
    }

    public Student(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  int getPoint() {
        return point;
    }
    

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }




    @Override
    public int compare(Student o1, Student o2) {
        return o1.getPoint() - o2.getPoint();
    }
}
