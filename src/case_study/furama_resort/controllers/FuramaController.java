package case_study.furama_resort.controllers;

import case_study.furama_resort.services.*;
import case_study.furama_resort.services.impl.*;

import java.io.IOException;
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
                                    employeeService.displayList();
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
                                    customerService.displayList();
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
                                    facilityService.displayList();
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
                                    bookingService.displayList();
                                    break;
                                case 3:
                                    contractService.addContact();
                                    break;
                                case 4:
                                    contractService.displayList();
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
                                    promotionService.displayList();
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
        }catch (Exception exception){
            System.out.println("Error");
        }
    }
}
