package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Booking;
import case_study.furama_resort.models.Customer;
import case_study.furama_resort.services.PromotionService;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    private static Set<Booking> bookingTreeSet;
    private static Stack<Customer> customerStack;

    public PromotionServiceImpl() {
        bookingTreeSet = new TreeSet<>();
        customerStack = new Stack<>();
    }

    public static Set<Booking> getBookingTreeSet() {
        return bookingTreeSet;
    }

    public static void setBookingTreeSet(Set<Booking> bookingTreeSet) {
        PromotionServiceImpl.bookingTreeSet = bookingTreeSet;
    }

    public static Stack<Customer> getCustomerStack() {
        return customerStack;
    }

    public static void setCustomerStack(Stack<Customer> customerStack) {
        PromotionServiceImpl.customerStack = customerStack;
    }

    @Override
    public void displayPromotionService() {
        bookingTreeSet = BookingServiceImpl.getBookingSet();
        for (Booking booking :bookingTreeSet){
            System.out.println(booking.toString());
        }
    }

    @Override
    public void displayPromotionVoucher() {
        customerStack.addAll(CustomerServiceImpl.getCustomerList());
        while (!customerStack.isEmpty()) {
            System.out.print(customerStack.pop());
        }
    }
}
