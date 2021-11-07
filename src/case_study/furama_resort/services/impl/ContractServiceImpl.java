package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Booking;
import case_study.furama_resort.models.Contract;
import case_study.furama_resort.services.ContractService;
import case_study.furama_resort.untils.FileWriteRead;

import java.io.IOException;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    private static Queue<Contract> contractQueue;
    Scanner scanner = new Scanner(System.in);
    FileWriteRead fileWriteRead = new FileWriteRead();

    public ContractServiceImpl() throws IOException {
        contractQueue = new ArrayDeque<>(); // Queue cơ chế mảng vào trước ra trước
        List<Object> objectList; // tạo 1 list Object nhận về giá trị của File và ép kiểu từng đối tượng
        objectList = fileWriteRead.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\contract.csv");
        for (Object o : objectList) {
            contractQueue.add((Contract) o);
        }
    }

    public static Queue<Contract> getContractQueue() {
        return contractQueue;
    }

    public static void setContractQueue(Queue<Contract> contractQueue) {
        ContractServiceImpl.contractQueue = contractQueue;
    }

    @Override
    public void addContact() {
        /**
         * tạo hợp đồng theo thứ tự list booking TreeSet
         * thằng nào booking trước thì được tạo contract trước
         */
        boolean check = true;
        try {
            for (Booking o : BookingServiceImpl.getBookingSet()) {
                if (o.getServiceName().equals("House") || o.getServiceName().equals("Villa")) {
                    int contractSome = (int) (Math.random() * 100);
                    String bookingCode = o.getBookingCode();
                    System.out.print("Enter the deposit Amount : ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter the total Payment Amount: ");
                    int totalPaymentAmount = scanner.nextInt();
                    String customerCode = o.getCustomerCode();
                    Contract contract = new Contract(contractSome, bookingCode, depositAmount, totalPaymentAmount, customerCode);
                    contractQueue.add(contract);
                    fileWriteRead.writeBuffer(contract, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\contract.csv");
                    check = true;
                    BookingServiceImpl.getBookingSet().remove(o);
                    break;
                }else {
                    check = false;
                }
            }
            if (!check){
                System.out.println(" This service does not need to create a contract ");
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    @Override
    public void updateContact() {
        boolean check = true;
        System.out.print("Enter the contract some : ");
        int contractSome = Integer.parseInt(scanner.nextLine());
        for (Contract contract : contractQueue) {
            if (contractSome == contract.getContractSome()) {
                System.out.print("Enter the deposit Amount : ");
                double depositAmount = Double.parseDouble(scanner.nextLine());
                contract.setDepositAmount(depositAmount);
                System.out.print("Enter the total Payment Amount: ");
                int totalPaymentAmount = scanner.nextInt();
                contract.setTotalPaymentAmount(totalPaymentAmount);
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.err.println("not found contract");
        }
    }

    @Override
    public void displayList() {
        for (Contract contract : contractQueue) {
            System.out.println(contract.toString());
        }
    }
}
