package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Contract;
import case_study.furama_resort.services.ContractService;
import case_study.furama_resort.untils.FileWriteRead;

import java.io.IOException;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    private static Queue<Contract> contractQueue;
    Scanner scanner = new Scanner(System.in);
    FileWriteRead fileWriteRead = new FileWriteRead();

    public ContractServiceImpl() {
        contractQueue = new ArrayDeque<>();
    }

    public static Queue<Contract> getContractQueue() {
        return contractQueue;
    }

    public static void setContractQueue(Queue<Contract> contractQueue) {
        ContractServiceImpl.contractQueue = contractQueue;
    }

    @Override
    public void displayContactList() {
        for (Contract contract : contractQueue) {
            System.out.println(contract.toString());
        }

    }

    @Override
    public void addContact() throws IOException {
        try {
            System.out.print("Enter the contract Some: ");
            int contractSome = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the booking Code :  ");
            int bookingCode = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the deposit Amount : ");
            double depositAmount = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the total Payment Amount: ");
            double totalPaymentAmount = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter the customer Code :  ");
            String customerCode = scanner.nextLine();
            Contract contract = new Contract(contractSome, bookingCode, depositAmount, totalPaymentAmount, customerCode);
            fileWriteRead.writeBuffer(contract, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\contract.csv");
            contractQueue.add(contract);
        }catch (Exception e){
            System.err.println("Error");
        }
    }

    @Override
    public void updateContact() {

    }
}
