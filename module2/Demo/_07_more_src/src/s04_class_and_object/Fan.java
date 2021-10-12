package s04_class_and_object;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    private Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public Fan() {
        this(FAST, true, 10, "red");;
    }
//
//    public Fan(int speed, boolean on) {
//        this.speed = speed;
//        this.on = on;
//    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString() {
        String status = "";
        if (this.on) {
            status = "Tốc độ " + speed + " Color " + color + " Radius " + radius + " Fan is On";

        } else {
            status = "Color " + color + " Radius " + radius + " Fan is Off ";
        }
        return status;
    }

    public void showInfo(){
        System.out.println("lop Fan");
    }

    public void test_1(){
        System.out.println("fan");
    }


    public static void main(String[] args) {
        System.out.println("Các thông tin của Fan :");

        Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");//gọi đối tượng thông qua từ khóa new
        System.out.println(fan1);

//        Fan fan2 =new Fan(Fan.MEDIUM, true);
//
//        fan2.setColor("Blue");
//        fan2.setOn(false);
//        System.out.println(fan2);


    }

}
