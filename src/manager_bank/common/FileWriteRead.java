package manager_bank.common;

import manager_bank.model.BankAccount;
import manager_bank.model.PaymentAccount;
import manager_bank.model.SavingAccount;
import manager_bank.service.IFileWriteRead;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRead implements IFileWriteRead {
    @Override
    public void writer(BankAccount bankAccount, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);// true tránh việc ghi đè
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(bankAccount.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    @Override
    public List<BankAccount> read(String path) throws IOException {
        List<BankAccount> bankAccountList = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            BankAccount paymentAccount, savingAccount;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 6) {
                    paymentAccount = new PaymentAccount(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]), Long.parseLong(temp[4]), Double.parseDouble(temp[5]));
                    bankAccountList.add(paymentAccount);
                } else if (temp.length == 8){
                    savingAccount = new SavingAccount(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]), Double.parseDouble(temp[4]), Integer.parseInt(temp[5]), Double.parseDouble(temp[6]), Integer.parseInt(temp[7]));
                    bankAccountList.add(savingAccount);
                }

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bankAccountList;
    }
}
