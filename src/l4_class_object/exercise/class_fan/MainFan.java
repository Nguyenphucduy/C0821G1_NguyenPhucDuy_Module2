package l4_class_object.exercise.class_fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.MEDIUM,true,10,"yellow");
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(Fan.FAST,false,5,"blue");
        System.out.println(fan2.toString());
    }

    public static class Fan {
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;// constant of class with static
        public static final int FAST = 3;
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public Fan() {
        }


        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on ;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius ;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color ;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            if (this.isOn()) {
                return "fan is on" + "\n" + "fan is spinning at speed is: " + this.speed + "\n" + "the color of the fan is : " + this.color + "\n" + "The radius of the fan is : " + this.radius;
            } else {
                return "fan is off" + "\n" + "the color of the fan is :" + this.color + "\n" + "The radius of the fan is : " + this.radius;
            }
        }
    }
}
