package s12_search;

public class Student implements Comparable<Student>{
    private int code;
    private String name;
    private String address;
    private double point;

    public Student(int code, String name, String address, double point) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.point = point;
    }

    public Student() {
    }

    public Student(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Student)){
            return false;
        }

        Student otherStudent = (Student) obj;

        if(this.code == otherStudent.getCode()){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Student o) {
        return o.getCode() - this.code;
    }
}
