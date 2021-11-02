package case_study.furama_resort.models;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String nameService, double usableArea, double rentCost, int numberOfPeople, int rentalType) {
        super(nameService, usableArea, rentCost, numberOfPeople, rentalType);
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String nameService, double usableArea, double rentCost, int numberOfPeople, int rentalType, String serviceFree) {
        super(nameService, usableArea, rentCost, numberOfPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.serviceFree;
    }
}
