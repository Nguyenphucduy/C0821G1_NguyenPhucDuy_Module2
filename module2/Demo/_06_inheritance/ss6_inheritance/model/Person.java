package ss6_inheritance.model;

public class Person {
    private String name;
    private int age;

    //Khai báo construstor không tham số để cho Java khi tạo object
    // của lớp con thì theo dây kế thừa sẽ tạo object của lớp cha
    // trước -> call construstor không tham số.
    public Person() {
        System.out.println("Tạo person");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("person đang ăn");
    }
    public Person getPerson() {
        System.out.println("Lớp person");
        return this;
    }
}
