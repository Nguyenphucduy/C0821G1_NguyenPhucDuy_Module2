package l19_creational_design_patterns.demo.singleton;

public class Singleton {
    //Eager
//    private static Singleton instance = new Singleton();
//    private Singleton(){};
//    public static Singleton getInstance(){
//        return instance;
//    }

    //lazy
//    private static Singleton instance;
//    private Singleton(){};
//    public static Singleton getInstance(){
//        if (instance==null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //Thread safe
    private static Singleton instance;
    private Singleton(){};
    public static synchronized Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
