package l5_access_modifier_static_method_static_roperty.exercise;

public class Student {
    private  static String name = "John";
    private   String classes = "C02";

    public Student() {
    }

    protected static String getName() {
        return name;
    }

    protected String getClasses() {
        return classes;
    }

    protected static void setName(String name) {
        Student.name = name ;
    }

    protected void setClasses(String classes) {
        this.classes = classes ;
    }


}
