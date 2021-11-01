package l19_creational_design_patterns.demo.singleton;

public class Service {
    public static void test(){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
