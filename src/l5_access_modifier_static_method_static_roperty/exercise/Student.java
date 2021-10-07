package l5_access_modifier_static_method_static_roperty.exercise;

public class Student {
    private  String name = "John";
    private  String classes = "C02";

    public Student() {
    }

    protected void setName(String name) {
        this.name = name ;
    }

    protected void setClasses(String classes) {
        this.classes = classes ;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("David");
        student.setClasses("C08");
        System.out.println("name is after changes is : " + student.name );
        System.out.println("classes is after changes is : " + student.classes );
    }

}
