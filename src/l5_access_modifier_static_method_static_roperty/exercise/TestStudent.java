package l5_access_modifier_static_method_static_roperty.exercise;

public class TestStudent extends Student{
    public static void main(String[] args) {
        Student student = new Student();
        Student.setName("David");
        student.setClasses("C08");
        System.out.println("name is after changes is : " + Student.getName() );
        System.out.println("classes is after changes is : " + student.getClasses());
    }
}
