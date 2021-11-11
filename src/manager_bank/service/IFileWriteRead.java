package manager_bank.service;

import manager_bank.model.BankAccount;

import java.io.IOException;
import java.util.List;

public interface IFileWriteRead {
    void writer(BankAccount bankAccount, String path) throws IOException;
    List<BankAccount> read(String path) throws IOException;
}
