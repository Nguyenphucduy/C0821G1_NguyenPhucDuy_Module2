package l6_inheritance.exercise;

public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MovablePoint(float xSpeed, float ySpeed) {
        super(); // call constructor ko tham so of superclass
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = {this.xSpeed,this.ySpeed};
        return arr;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return " MovablePoint{" +
                " \nxSpeed=" + xSpeed +
                ", \nySpeed=" + ySpeed +
                super.toString() +
                '}';
    }
    public MovablePoint move(){
        this.setX(super.getX() + this.xSpeed);
        this.setY(super.getY() + this.ySpeed);
        return this;
    }
}
