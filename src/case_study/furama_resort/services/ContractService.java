package case_study.furama_resort.services;

import java.io.IOException;

public interface ContractService extends Service{
    void displayContactList();
    void addContact() throws IOException;
    void updateContact();
}
