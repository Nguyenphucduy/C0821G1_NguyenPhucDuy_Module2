package review.week4.candidat_management_system.controller;

import review.week4.candidat_management_system.model.Experience;

import java.util.ArrayList;
import java.util.Scanner;

public class CandidateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Experience> experienceArrayList = new ArrayList<Experience>();
        int choice;
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience ");
            System.out.println("2. Fresher ");
            System.out.println("3. Internship ");
            System.out.println("4. Searching ");
            System.out.println("5. Exit  ");
            System.out.print("Enter the choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the information experience : id, birth date, phone, first name,  last name, address, email, expInYear,  proSkill");
                    System.out.print("Enter the id : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the birth date ");
                    int[] birthYear = new int[4];
                    int birthYearItem ;
                    for (int i = 0; i < birthYear.length; i++) {
                         birthYearItem = Integer.parseInt(scanner.nextLine());
                        birthYear[i] = birthYearItem;
                    }
                    System.out.print("Enter the phone : ");
                    int[] phone = new int[10];
                    int phoneItem;
                    for (int i = 0; i < phone.length ; i++) {
                        phoneItem = Integer.parseInt(scanner.nextLine());
                        phone[i] = phoneItem;
                    }
                    String firstName = scanner.nextLine();
                    String lastName = scanner.nextLine();
                    System.out.print("Enter the address : ");
                    String address = scanner.nextLine();
                    System.out.print("Enter the email : ");
                    String email = scanner.nextLine();
                    System.out.print("Enter the expInYear : ");
                    int expInYear = Integer.parseInt(scanner.nextLine());
                    String proSkill = scanner.nextLine();
                    System.out.print("Enter the proSkill : ");

                    Experience experience = new Experience(id, birthYear, phone, firstName, lastName, address, email, expInYear, proSkill);
                    experienceArrayList.add(experience);
                    System.out.println(experienceArrayList);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    System.exit(5);
                default:
                    System.err.println(" NO CHOICE ! ");
            }
        } while (choice != 5);
    }
}
