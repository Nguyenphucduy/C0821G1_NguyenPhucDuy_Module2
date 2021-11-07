package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Booking;
import case_study.furama_resort.services.PromotionService;

import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    private static Set<Booking> bookingTreeSet;
    private static Stack<String> customerStack;
    Scanner scanner = new Scanner(System.in);

    public PromotionServiceImpl() {
        bookingTreeSet = new TreeSet<>();
        customerStack = new Stack<String>();
    }

    public static Set<Booking> getBookingTreeSet() {
        return bookingTreeSet;
    }

    public static void setBookingTreeSet(Set<Booking> bookingTreeSet) {
        PromotionServiceImpl.bookingTreeSet = bookingTreeSet;
    }

    public static Stack<String> getCustomerStack() {
        return customerStack;
    }

    public static void setCustomerStack(Stack<String> customerStack) {
        PromotionServiceImpl.customerStack = customerStack;
    }

    @Override
    public void displayPromotionVoucher() {
        for (Booking booking : BookingServiceImpl.getBookingSet()) {
            customerStack.push(booking.getCustomerCode());
        }
        System.out.print("Enter the voucher 10% :  ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the voucher 20% :  ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the voucher 50% :  ");
        int c = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < a; i++ ){
            System.out.println(customerStack.pop() + " you get 10% voucher ");
        }
        for (int i = 0; i < b; i++ ){
            System.out.println(customerStack.pop() + " you get 20% voucher ");
        }
        for (int i = 0; i < c; i++ ){
            System.out.println(customerStack.pop() + " you get 50% voucher ");
        }
    }

    @Override
    public void displayList() {
        for (Booking booking : BookingServiceImpl.getBookingSet()) {
            if (booking.getServiceType().equals("year")) {
                bookingTreeSet.add(booking);
            }
        }
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking.toString());
        }
    }
}
