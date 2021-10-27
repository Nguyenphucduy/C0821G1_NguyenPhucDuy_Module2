package case_study.furama_resort.controller;

import java.util.Scanner;

public class FuramaController {
    //    public void displayMainMenu() {
    public static void main(String[] args) {

        int choice, choice2;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management ");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
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
                                break;
                            case 2:
                                break;
                            case 3:
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
                                break;
                            case 2:
                                break;
                            case 3:
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
                                break;
                            case 2:
                                break;
                            case 3:
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
                        System.out.println("3. Create new constracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts ");
                        System.out.println("6. Return main menu");
                        System.out.print("Enter your choice: ");
                        choice2 = scanner.nextInt();
                        switch (choice2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
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
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("No choice!");
                        }
                    } while (choice2 != 3);
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("No choice!");

            }
        } while (choice != 6);
    }
}
