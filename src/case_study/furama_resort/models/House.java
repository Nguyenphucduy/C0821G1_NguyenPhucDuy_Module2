package case_study.furama_resort.models;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String codeService, String nameService, double usableArea, double rentCost, int numberOfPeople, String rentalType) {
        super(codeService, nameService, usableArea, rentCost, numberOfPeople, rentalType);
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String codeService, String nameService, double usableArea, double rentCost, int numberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(codeService, nameService, usableArea, rentCost, numberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.roomStandard + "," + this.numberOfFloors;
    }
}
