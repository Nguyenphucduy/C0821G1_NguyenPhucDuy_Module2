package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Booking;
import case_study.furama_resort.services.BookingService;
import case_study.furama_resort.services.CustomerService;
import case_study.furama_resort.untils.FileWriteRead;
import case_study.furama_resort.untils.Validate;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements BookingService {
    private static Set<Booking> bookingSet ;
    Scanner scanner = new Scanner(System.in);
    FileWriteRead fileWriteRead = new FileWriteRead();
    CustomerService customerService = new CustomerServiceImpl();

    public BookingServiceImpl() throws IOException {
        bookingSet = new TreeSet<>();
    }

    public static Set<Booking> getBookingSet() {
        return bookingSet;
    }

    public static void setBookingSet(Set<Booking> bookingSet) {
        BookingServiceImpl.bookingSet = bookingSet;
    }

    @Override
    public void displayBookingList() {
        for (Booking booking : bookingSet){
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addBooking() throws IOException {
        try {
            System.out.print("Enter the booking Code: ");
            String bookingCode = scanner.nextLine();
            int startDay = Validate.inputDay();
            int endDay = Validate.inputDay();
            System.out.println("List Customer -------------------------");
            customerService.displayCustomerList();
            System.out.print("Enter the customer Code: ");
            String customerCode = scanner.nextLine();
            String serviceName = Validate.inputNameService();
            String serviceType = Validate.inputServiceType();
            Booking booking = new Booking(bookingCode, startDay, endDay, customerCode, serviceName, serviceType);
            fileWriteRead.writeBuffer(booking, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\booking.csv");
            bookingSet.add(booking);
        }catch (Exception exception){
            System.err.println("Error");
        }
    }

}
