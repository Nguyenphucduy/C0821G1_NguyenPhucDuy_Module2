package ss6_inheritance.model;

public final class Student extends Person {
    private static String nameClass;
    private double point;

    static {
        nameClass = "C0821G2";
    }

    public Student(String name, int age, String nameClass, double point) {
        super(name,age);
        this.nameClass = nameClass;
        this.point = point;
    }

    public Student(String name, int age, double point) {
//        super.setName(name);
//        super.setAge(age);
        super(name,age);
        this.point = point;
    }

    public Student() {
        System.out.println("Tạo student");
    }


    public static String getNameClass() {
        return nameClass;
    }

    public static void setNameClass(String nameClass) {
        Student.nameClass = nameClass;
    }

    public double getPoint() {
        return point;
    }
//    public double getPoint(int abc) {
//        return point;
//    }

//    @Override //đánh dấu phương thức được override.
////    public String toString() {
////        return this.getName()+this.getPoint();
////    }


    @Override
    public String toString() {
        return super.toString()+ "Student{" +
                "point=" + point +
                "} " + super.toString();
    }

    public void eat() {
        System.out.println("student đang ăn.");
    }

    @Override
    public Student getPerson() {
        System.out.println(super.getName());
        System.out.println("Lớp Student");
        return this;
    }

    public String showInfo() {
        return this.getName()+this.getPoint();
    }
    public void setPoint(double point) {
        this.point = point;
    }

    public static void main(String[] args) {

    }
}
