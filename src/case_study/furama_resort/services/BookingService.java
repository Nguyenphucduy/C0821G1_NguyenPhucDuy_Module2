package case_study.furama_resort.services;

import java.io.IOException;

public interface BookingService extends Service{
    void displayBookingList();
    void addBooking() throws IOException;
}
