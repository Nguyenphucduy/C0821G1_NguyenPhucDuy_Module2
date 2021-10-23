package review.week1_week2.manage_bank.superclass;

public class Vehicle {
    private double carValue;
    private int cc;

    public Vehicle() {
    }

    public Vehicle(double carValue, int cc) {
        this.carValue = carValue;
        this.cc = cc;
    }

    public double getCarValue() {
        return carValue;
    }

    public void setCarValue(double carValue) {
        this.carValue = carValue;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    public double taxCalculation(){
        if (this.cc<100){
            return this.carValue/100;
        }else if (this.cc <= 200){
            return (this.carValue/100)*3;
        }else {
            return (this.carValue/100)*5;
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carValue=" + carValue +" USD" +
                ", cc=" + cc + "cc" +
                ", tax=" + this.taxCalculation()+ " USD" +
                '}';
    }
}
