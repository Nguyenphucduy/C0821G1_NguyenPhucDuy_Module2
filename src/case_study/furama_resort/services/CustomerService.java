package case_study.furama_resort.services;

import java.io.IOException;

public interface CustomerService extends Service{
    void displayCustomerList();
    void addCustomer() throws IOException;
    void updateCustomer() throws IOException;
}
