package ss6_inheritance.model;

public class Teacher extends Person {
    private String address;
    private String phone;

    public Teacher() {
    }

    public Teacher(String name, int age,String address, String phone) {
        this.setName(name);
        this.setAge(age);
        this.address = address;
        this.phone = phone;
    }
}
