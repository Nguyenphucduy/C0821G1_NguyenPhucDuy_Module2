package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.*;
import case_study.furama_resort.services.BookingService;
import case_study.furama_resort.services.CustomerService;
import case_study.furama_resort.untils.FileWriteRead;
import case_study.furama_resort.untils.Validate;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    private static Set<Booking> bookingSet;
    FileWriteRead fileWriteRead = new FileWriteRead();
    CustomerService customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public BookingServiceImpl() throws IOException {
        bookingSet = new TreeSet<>(); // Tree Set lưu giá trị không trùng lặp và sắp xếp tăng dần theo startDay va endDay
        List<Object> objectList; // tạo 1 list Object nhận về giá trị của File và ép kiểu từng đối tượng
        objectList = fileWriteRead.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\booking.csv");
        for (Object o : objectList) {
            bookingSet.add((Booking) o);
        }
    }


    public static Set<Booking> getBookingSet() {
        return bookingSet;
    }

    public static void setBookingSet(Set<Booking> bookingSet) {
        BookingServiceImpl.bookingSet = bookingSet;
    }


    @Override
    public void addBooking() {
        try {
            String bookingCode = Validate.inputBookingCode();
            int startDay = Validate.inputStartDay();
            int endDay = Validate.inputEndDay();
            System.out.println("List Customer Start ------------------------------------------------------");
            customerService.displayCustomerCode();
            System.out.println("List Customer End --------------------------------------------------------");
            String customerCode = Validate.inputCustomerCode();
            String serviceName = Validate.inputNameService();
            System.out.println("List Service Start ------------------------------------------------------");
            facilityService.displayList();
            System.out.println("List Service End --------------------------------------------------------");
            System.out.println("code service");
            String choice = scanner.nextLine(); // constructor 1 tham so code service
            if (choice.startsWith("V")) {
                Facility facility = new Villa(choice);
                if (FacilityServiceImpl.getLinkedHashmap().containsKey(facility)) {
                    int valueKey = FacilityServiceImpl.getLinkedHashmap().get(facility);
                    FacilityServiceImpl.getLinkedHashmap().put(facility, valueKey + 1);
                } else {
                    FacilityServiceImpl.getLinkedHashmap().put(facility, 1);
                }
            } else if (choice.startsWith("H")) {
                Facility facility = new House(choice);
                if (FacilityServiceImpl.getLinkedHashmap().containsKey(facility)) {
                    int valueKey = FacilityServiceImpl.getLinkedHashmap().get(facility);
                    FacilityServiceImpl.getLinkedHashmap().put(facility, valueKey + 1);
                } else {
                    FacilityServiceImpl.getLinkedHashmap().put(facility, 1);
                }
            } else {
                Facility facility = new Room(choice);
                if (FacilityServiceImpl.getLinkedHashmap().containsKey(facility)) {
                    int valueKey = FacilityServiceImpl.getLinkedHashmap().get(facility);
                    FacilityServiceImpl.getLinkedHashmap().put(facility, valueKey + 1);
                } else {
                    FacilityServiceImpl.getLinkedHashmap().put(facility, 1);
                }
            }
            String serviceType = Validate.inputServiceType();
            Booking booking = new Booking(bookingCode, startDay, endDay, customerCode, serviceName, serviceType);
            fileWriteRead.writeBuffer(booking, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\booking.csv");
            if (bookingSet.contains(booking)) {
                throw new Exception("Booking code already exists");
            } else {
                bookingSet.add(booking);
            }
        } catch (Exception exception) {
            System.err.println("Error");
        }
    }

    @Override
    public void displayList() {
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }
}
