package case_study.furama_resort.models;


public abstract class Facility {
    private String nameService;
    private double usableArea;
    private double rentCost;
    private int numberOfPeople;
    private int rentalType;

    public Facility() {
    }

    public Facility(String nameService, double usableArea, double rentCost, int numberOfPeople, int rentalType) {
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getRentalType() {
        return rentalType;
    }

    public void setRentalType(int rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return this.nameService + "," + this.usableArea + "," + this.rentCost + "," + this.numberOfPeople + "," + this.rentalType;
    }
}
