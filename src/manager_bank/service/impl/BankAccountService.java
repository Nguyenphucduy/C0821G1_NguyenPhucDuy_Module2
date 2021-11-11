package manager_bank.service.impl;

import manager_bank.common.FileWriteRead;
import manager_bank.model.BankAccount;
import manager_bank.model.PaymentAccount;
import manager_bank.model.SavingAccount;
import manager_bank.service.IBankAccountService;
import manager_bank.service.IPaymentAccount;
import manager_bank.service.ISavingAccount;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountService implements IBankAccountService, IPaymentAccount, ISavingAccount {
    List<BankAccount> bankAccountList;
    Scanner scanner = new Scanner(System.in);
    FileWriteRead fileWriteRead = new FileWriteRead();

    public BankAccountService(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public BankAccountService() throws IOException {
        bankAccountList = new ArrayList<>();
        bankAccountList.addAll(fileWriteRead.read("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\manager_bank\\data\\payment_account.csv"));
        bankAccountList.addAll(fileWriteRead.read("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\manager_bank\\data\\saving_account.csv"));
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    @Override
    public void displayBankAccount() {
        for (BankAccount bankAccount : bankAccountList) {
            System.out.println(bankAccount.toString());
        }
    }

    @Override
    public void removeBankAccount() {
        boolean check = true;
        BankAccount bankAccountRemove = null;
        System.out.println(" mời bạn nhập mã ngân hàng ");
        String accountCodeRemove = scanner.nextLine();
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getAccountCode().equals(accountCodeRemove)) {
                bankAccountRemove = bankAccount;
                check = true;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println(" Không có mã ngân hàng trong danh sách");
        }else {
            System.out.println("Bạn có muốn xóa không? (Yes/No)");
            String choice = scanner.nextLine();
            if (choice.equals("Yes")){
                bankAccountList.remove(bankAccountRemove);
            }
        }
    }

    @Override
    public void searchBankAccount() {
        boolean check = true;
        int index = 0;
        System.out.print("Mời bạn nhập mã tài khoản khoặc tên chủ tài khoản ");
        String search = scanner.nextLine();
        for (int i = 0; i < bankAccountList.size(); i++) {
            if (bankAccountList.get(i).getAccountCode().contains(search) || bankAccountList.get(i).getAccountName().contains(search)) {
                index = i;
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.err.println("Không tìm thấy");
        } else {
            System.out.println("Tài khoản của bạn cần tìm kiếm là :");
            System.out.println(bankAccountList.get(index));
        }
    }

    @Override
    public void addPaymentAccount() throws IOException {
        System.out.print("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số tài khoản :");
        String accountCode = scanner.nextLine();
        System.out.print("Nhập tên tài khoản :");
        String accountName = scanner.nextLine();
        System.out.print("Nhập ngày tạo tài khoản :");
        int accountCreationDate = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số thẻ :");
        int cardNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập  số tiền trong tài khoản :");
        double moneyAccount = Double.parseDouble(scanner.nextLine());
        PaymentAccount paymentAccount = new PaymentAccount(id, accountCode, accountName, accountCreationDate, cardNumber, moneyAccount);
        bankAccountList.add(paymentAccount);
        fileWriteRead.writer(paymentAccount, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\manager_bank\\data\\payment_account.csv");

    }

    @Override
    public void addSavingAccount() throws IOException {
        System.out.print("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số tài khoản :");
        String accountCode = scanner.nextLine();
        System.out.print("Nhập tên tài khoản :");
        String accountName = scanner.nextLine();
        System.out.print("Nhập ngày tạo tài khoản :");
        int accountCreationDate = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số tiền gửi tiết kiệm :");
        double savingDepositAmount = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập ngày gửi tiết kiệm :");
        int depositDateSavings = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập  lãi xuất :");
        double interest = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập kỳ hạn :");
        int term = Integer.parseInt(scanner.nextLine());
        SavingAccount savingAccount = new SavingAccount(id, accountCode, accountName, accountCreationDate, savingDepositAmount, depositDateSavings, interest, term);
        bankAccountList.add(savingAccount);
        fileWriteRead.writer(savingAccount, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\manager_bank\\data\\saving_account.csv");
    }
}
