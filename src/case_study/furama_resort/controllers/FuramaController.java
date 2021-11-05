package case_study.furama_resort.controllers;

import case_study.furama_resort.services.*;
import case_study.furama_resort.services.impl.*;
import case_study.furama_resort.untils.FileWriteRead;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);

        int choice, choice2;

        EmployeeService employeeService = new EmployeeServiceImpl();
        CustomerService customerService = new CustomerServiceImpl();
        FacilityService facilityService = new FacilityServiceImpl();
        BookingService bookingService = new BookingServiceImpl();
        ContractService contractService = new ContractServiceImpl();
        PromotionService promotionService = new PromotionServiceImpl();
        FileService fileService = new FileWriteRead();
        try {
            do {
                System.out.println("Menu");
                System.out.println("1. Employee Management");
                System.out.println("2. Customer Management");
                System.out.println("3. Facility Management ");
                System.out.println("4. Booking Management");
                System.out.println("5. Promotion Management");
                System.out.println("6. Exit");
                System.out.print("Enter your choice : ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        do {
                            System.out.println("Menu");
                            System.out.println("1 Display list employees");
                            System.out.println("2 Add new employee");
                            System.out.println("3. Edit employee ");
                            System.out.println("4 Return main menu");
                            System.out.print("Enter your choice : ");
                            choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1:
                                    employeeService.displayEmployeeList();
                                    break;
                                case 2:
                                    employeeService.addEmployee();
                                    break;
                                case 3:
                                    employeeService.updateEmployee();
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("No choice!");
                            }
                        } while (choice2 != 4);
                        break;
                    case 2:
                        do {
                            System.out.println("Menu");
                            System.out.println("1. Display list customers");
                            System.out.println("2. Add new customer");
                            System.out.println("3. Edit customer");
                            System.out.println("4. Return main menu");
                            System.out.print("Enter your choice: ");
                            choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1:
                                    customerService.displayCustomerList();
                                    break;
                                case 2:
                                    customerService.addCustomer();
                                    break;
                                case 3:
                                    customerService.updateCustomer();
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("No choice!");
                            }
                        } while (choice2 != 4);
                        break;
                    case 3:
                        do {
                            System.out.println("Menu");
                            System.out.println("1. Display list facility");
                            System.out.println("2. Add new facility");
                            System.out.println("3. Display list facility maintenance");
                            System.out.println("4. Return main menu");
                            System.out.print("Enter your choice: ");
                            choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1:
                                    facilityService.displayFacilityList();
                                    break;
                                case 2:
                                    facilityService.addFacilityList();
                                    break;
                                case 3:
                                    facilityService.displayFacilityListMaintenance();
                                    break;
                                case 4:
                                    break;
                                default:
                                    System.out.println("No choice!");
                            }
                        } while (choice2 != 4);
                        break;
                    case 4:
                        do {
                            System.out.println("Menu");
                            System.out.println("1. Add new booking");
                            System.out.println("2. Display list booking");
                            System.out.println("3. Create new contracts");
                            System.out.println("4. Display list contracts");
                            System.out.println("5. Edit contracts ");
                            System.out.println("6. Return main menu");
                            System.out.print("Enter your choice: ");
                            choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1:
                                    bookingService.addBooking();
                                    break;
                                case 2:
                                    bookingService.displayBookingList();
                                    break;
                                case 3:
                                    contractService.addContact();
                                    break;
                                case 4:
                                    contractService.displayContactList();
                                    break;
                                case 5:
                                    contractService.updateContact();
                                    break;
                                case 6:
                                    break;
                                default:
                                    System.out.println("No choice!");
                            }
                        } while (choice2 != 6);
                        break;
                    case 5:
                        do {
                            System.out.println("Menu");
                            System.out.println("1. Display list customers use service");
                            System.out.println("2. Display list customers get voucher");
                            System.out.println("3. Return main menu");
                            System.out.print("Enter your choice: ");
                            choice2 = scanner.nextInt();
                            switch (choice2) {
                                case 1:
                                    promotionService.displayPromotionService();
                                    break;
                                case 2:
                                    promotionService.displayPromotionVoucher();
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("No choice!");
                            }
                        } while (choice2 != 3);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("No choice!");

                }
            } while (choice != 6);
            List<Object> employeeList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\employee.csv");
            System.err.println(" employee ------------------------------------------------------------------");
            for (Object service : employeeList) {
                System.err.println(service);
            }
            List<Object> customerList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\customer.csv");
            System.err.println("customer ------------------------------------------------------------------");
            for (Object service : customerList) {
                System.err.println(service);
            }
            List<Object> roomList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\room.csv");
            System.err.println("room -------------------------------------------------------------------");
            for (Object service : roomList) {
                System.err.println(service);
            }
            List<Object> houseList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\house.csv");
            System.err.println("house -------------------------------------------------------------------");
            for (Object service : houseList) {
                System.err.println(service);
            }
            List<Object> villaList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\villa.csv");
            System.err.println("villa -------------------------------------------------------------------");
            for (Object service : villaList) {
                System.err.println(service);
            }
            List<Object> bookingList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\booking.csv");
            System.err.println("booking-------------------------------------------------------------------");
            for (Object service : bookingList) {
                System.err.println(service);
            }
            List<Object> contractList = fileService.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\contract.csv");
            System.err.println("villa contract -------------------------------------------------------------------");
            for (Object service : contractList) {
                System.err.println(service);
            }
        }catch (Exception exception){
            System.out.println("Error");
        }
    }
}
