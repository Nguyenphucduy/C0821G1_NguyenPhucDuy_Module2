package case_study.furama_resort.models;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String nameService, double usableArea, double rentCost, int numberOfPeople, int rentalType) {
        super(nameService, usableArea, rentCost, numberOfPeople, rentalType);
    }

    public Villa(String roomStandard, double poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String nameService, double usableArea, double rentCost, int numberOfPeople, int rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(nameService, usableArea, rentCost, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.roomStandard + "," + this.poolArea + "," + this.numberOfFloors;
    }
}
