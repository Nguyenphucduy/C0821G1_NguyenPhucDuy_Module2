package review.review_week_3.abc_school_manage_student.model;

import java.util.Comparator;

public class Student implements Comparable<Student> {
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
    public int compareTo(Student o) {
        return this.point - getPoint();
    }



}
