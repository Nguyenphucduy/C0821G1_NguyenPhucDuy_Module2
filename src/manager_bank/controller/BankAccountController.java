package manager_bank.controller;

import manager_bank.service.impl.BankAccountService;

import java.io.IOException;
import java.util.Scanner;

public class BankAccountController {
    public static void displayMainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BankAccountService bankAccountService = new BankAccountService();
        try {
            int choice2 ;
            int choice ;
            do {
                System.out.println("Chọn chức năng theo số (để tiếp tục ):");
                System.out.println("1. Thêm mới");
                System.out.println("2. Xóa");
                System.out.println("3. Xem danh sách tài khoản ngân hàng ");
                System.out.println("4. Tìm kiếm");
                System.out.println("5. Thoát");
                System.out.print("Chọn chức năng : ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        do {
                            System.out.println("Mời bạn chọn chức năng");
                            System.out.println("1. Thêm mới tài khoản tiết kiệm");
                            System.out.println("2. Thêm mới tài khoản thanh toán");
                            System.out.println("3. Quay về menu trước");
                            System.out.print("Mời bạn chọn : ");
                            choice2 = Integer.parseInt(scanner.nextLine());
                            switch (choice2) {
                                case 1:
                                    bankAccountService.addSavingAccount();
                                    break;
                                case 2:
                                    bankAccountService.addPaymentAccount();
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("No choice!");
                            }
                        } while (choice2 != 3);
                        break;
                    case 2:
                        bankAccountService.removeBankAccount();
                        break;
                    case 3:
                        bankAccountService.displayBankAccount();
                        break;
                    case 4:
                        bankAccountService.searchBankAccount();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("không có chức năng");
                }
            } while (choice != 5);
        } catch (Exception exception) {
            System.err.println("Bạn đã gặp lỗi");
        }
    }
}
