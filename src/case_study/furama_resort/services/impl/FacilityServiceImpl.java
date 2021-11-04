package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.House;
import case_study.furama_resort.models.Room;
import case_study.furama_resort.models.Villa;
import case_study.furama_resort.services.FacilityService;
import case_study.furama_resort.services.HouseService;
import case_study.furama_resort.services.RoomService;
import case_study.furama_resort.services.VillaService;
import case_study.furama_resort.untils.FileWriteRead;
import case_study.furama_resort.untils.Validate;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService, HouseService, RoomService, VillaService {
    private static Map<Facility, Integer> linkedHashmap;
    Scanner scanner = new Scanner(System.in);
    FileWriteRead fileWriteRead = new FileWriteRead();

    public FacilityServiceImpl() throws IOException {
        linkedHashmap = new LinkedHashMap<>();
//        linkedHashmap.put((Facility) fileWriteRead.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\house.csv"),1);
//        linkedHashmap.put((Facility) fileWriteRead.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\room.csv"),1);
//        linkedHashmap.put((Facility) fileWriteRead.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\villa.csv"),1);
    }

    public static Map<Facility, Integer> getLinkedHashmap() {
        return linkedHashmap;
    }

    public static void setLinkedHashmap(Map<Facility, Integer> linkedHashmap) {
        FacilityServiceImpl.linkedHashmap = linkedHashmap;
    }

    @Override
    public void displayFacilityList() {
        Set<Facility> facilities = linkedHashmap.keySet();
        for (Facility facility : facilities) {
            System.out.println("key : " + facility + "value : " + linkedHashmap.get(facility));
        }
    }


    @Override
    public void addFacilityList() {
        Facility facility = new Facility() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };
        Facility facilityService = null;
        int choice;
        try {
            do {
                System.out.println(" Facility Service ");
                System.out.println("1. New Villa");
                System.out.println("2. New House");
                System.out.println("3. New Room ");
                System.out.println("4. Back to menu");
                System.out.print("Enter your choice service : ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        facilityService = addVilla();
                        break;
                    case 2:
                        facilityService = addHouse();
                        break;
                    case 3:
                        facilityService = addRoom();
                        break;
                    case 4:
                        break;
                }
                if (linkedHashmap.containsKey(facilityService)) { // Check Key có trong map hay không,contanskey check key có trong map ko
                    int valueKey = linkedHashmap.get(facilityService);
                    linkedHashmap.put(facilityService, valueKey + 1);// add key và giá trị vào map
                } else {
                    linkedHashmap.put(facilityService, 1);
                }

            } while (choice != 4);
        } catch (Exception exception) {
            System.err.println("Error");
        }
    }

    @Override
    public void displayFacilityListMaintenance() {

    }

    @Override
    public Facility addHouse() throws IOException {
        String codeService = Validate.inputCodeService();
        String nameService = Validate.inputNameService();
        double usableArea = Validate.inputArea();
        double rentCost = Validate.inputRentCost();
        int numberOfPeople = Validate.inputNumberOfPeople();
        String rentalType = Validate.inputRentalType();
        String roomStandard = Validate.inputRoomStandard();
        int numberOfFloors = Validate.inputNumberOfFloor();
        House house = new House(codeService, nameService, usableArea, rentCost, numberOfPeople, rentalType, roomStandard, numberOfFloors);
        fileWriteRead.writeBuffer(house, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\house.csv");
        return house;
    }

    @Override
    public Facility addRoom() throws IOException {
        String codeService = Validate.inputCodeService();
        String nameService = Validate.inputNameService();
        double usableArea = Validate.inputArea();
        double rentCost = Validate.inputRentCost();
        int numberOfPeople = Validate.inputNumberOfPeople();
        String rentalType = Validate.inputRentalType();
        System.out.print("Enter the service Free: ");
        String serviceFree = scanner.nextLine();
        Room room = new Room(codeService, nameService, usableArea, rentCost, numberOfPeople, rentalType, serviceFree);
        fileWriteRead.writeBuffer(room, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\room.csv");
        return room;

    }

    @Override
    public Facility addVilla() throws IOException {
        String codeService = Validate.inputCodeService();
        String nameService = Validate.inputNameService();
        double usableArea = Validate.inputArea();
        double rentCost = Validate.inputRentCost();
        int numberOfPeople = Validate.inputNumberOfPeople();
        String rentalType = Validate.inputRentalType();
        String roomStandard = Validate.inputRoomStandard();
        double poolArea = Validate.inputArea();
        int numberOfFloors = Validate.inputNumberOfFloor();
        Villa villa = new Villa(codeService, nameService, usableArea, rentCost, numberOfPeople, rentalType, roomStandard, poolArea, numberOfFloors);
        fileWriteRead.writeBuffer(villa, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\villa.csv");

        return villa;
    }
}
