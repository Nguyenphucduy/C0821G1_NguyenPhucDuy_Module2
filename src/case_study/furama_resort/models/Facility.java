package case_study.furama_resort.models;

import java.util.Objects;

public abstract class Facility  {
    private String codeService;
    private String nameService;
    private double usableArea;
    private double rentCost;
    private int numberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String codeService) {
        this.codeService = codeService;
    }

    public Facility(String codeService, String nameService, double usableArea, double rentCost, int numberOfPeople, String rentalType) {
        this.codeService = codeService;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
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

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return this.codeService + "," + this.nameService + "," + this.usableArea + "," + this.rentCost + "," + this.numberOfPeople + "," + this.rentalType;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Facility)){
            return false;
        }
        Facility facility = (Facility) obj;

        return this.codeService.equals(facility.codeService);// 2 đối tượng có codeService bằng nhau thì bằng nhau
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeService);
    }
}
