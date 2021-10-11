package l4_class_object.exercise.class_fan;

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.MEDIUM,true,10,"yellow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(Fan.FAST,false,5,"blue");
        System.out.println(fan2.toString());
    }
}
