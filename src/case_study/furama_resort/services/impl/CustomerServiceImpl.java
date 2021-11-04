package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Customer;
import case_study.furama_resort.services.CustomerService;
import case_study.furama_resort.untils.FileWriteRead;
import case_study.furama_resort.untils.Validate;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList;
    Scanner scanner = new Scanner(System.in);
    FileWriteRead fileWriteRead = new FileWriteRead();

    public CustomerServiceImpl() throws IOException {
        customerList = new LinkedList<>();
//        customerList.add((Customer) fileWriteRead.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\customer.csv"));
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        CustomerServiceImpl.customerList = customerList;
    }

    @Override
    public void displayCustomerList() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addCustomer() throws IOException {
        try {
            System.out.print("Enter the full name: ");
            String fullName = scanner.nextLine();
            System.out.print("Enter the date of birth :  ");
            String dateOfBirth = scanner.nextLine();
            String gender = Validate.inputGender();
            System.out.print("Enter the identity Card Number: ");
            String identityCardNumber = scanner.nextLine();
            String phoneNumber = Validate.inputPhoneNumber();
            System.out.print("Enter the email: ");
            String email = scanner.nextLine();
            System.out.print("Enter the customer Code: ");
            String customerCode = scanner.nextLine();
            String customerType = Validate.inputCustomerType();
            System.out.print("Enter the address : ");
            String address = scanner.nextLine();
            Customer customer = new Customer(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email, customerCode, customerType, address);
            customerList.add(customer);
            fileWriteRead.writeBuffer(customer, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\customer.csv");
        }catch (Exception exception){
            System.out.println("Error");
        }
    }

    @Override
    public void updateCustomer() throws IOException {
        try {
            System.out.print("Enter the index you want update : ");
            int index = Integer.parseInt(scanner.nextLine());
            index = customerList.indexOf(customerList.get(index));

            if (index == -1) {
                System.err.println("not found");
            } else if (index < customerList.size()) {
                System.out.print("Enter the update full name: ");
                String fullName = scanner.nextLine();
                customerList.get(index).setFullName(fullName);
                System.out.print("Enter the update date of birth :  ");
                String dateOfBirth = scanner.nextLine();
                customerList.get(index).setDateOfBirth(dateOfBirth);
                String gender = Validate.inputGender();
                customerList.get(index).setGender(gender);
                System.out.print("Enter the update identity Card Number: ");
                String identityCardNumber = scanner.nextLine();
                customerList.get(index).setIdentityCardNumber(identityCardNumber);
                String phoneNumber = Validate.inputPhoneNumber();
                customerList.get(index).setPhoneNumber(phoneNumber);
                String email = Validate.inputEmail();
                customerList.get(index).setEmail(email);
                System.out.print("Enter update the customer code: ");
                String customerCode = scanner.nextLine();
                customerList.get(index).setCustomerCode(customerCode);
                String customerType = Validate.inputCustomerType();
                customerList.get(index).setCustomerType(customerType);
                System.out.print("Enter update the address : ");
                String address = scanner.nextLine();
                customerList.get(index).setAddress(address);
                customerList.set(index, customerList.get(index));
                fileWriteRead.writeBuffer(customerList.get(index), "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\customer.csv");
            }
            System.out.println("update done ---------------------------------------------------------");
            System.out.print(customerList.get(index));
        }catch (Exception e){
            System.err.println("Error");
        }
    }
}
