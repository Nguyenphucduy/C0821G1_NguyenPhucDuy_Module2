package review.week4.candidat_management_system.controller;

import review.week4.candidat_management_system.model.Experience;
import review.week4.candidat_management_system.model.Fresher;
import review.week4.candidat_management_system.model.Intern;
import review.week4.candidat_management_system.service.impl.ExperienceService;

import java.util.ArrayList;
import java.util.Scanner;

public class CandidateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Experience> experienceArrayList = new ArrayList<Experience>();
        ArrayList<Fresher> freshersArrayList = new ArrayList<Fresher>();
        ArrayList<Intern> internsArrayList = new ArrayList<Intern>();
        int choice;
        String choice2;
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience ");
            System.out.println("2. Fresher ");
            System.out.println("3. Internship ");
            System.out.println("4. Searching ");
            System.out.println("5. Exit  ");
            System.out.print("Enter the choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            int[] birthYear = new int[4];
            int birthYearItem;
            int[] phone = new int[10];
            int phoneItem;
            int id;
            int expInYear = 0;
            int value;
            String firstName;
            String lastName;
            String address;
            String email;
            String proSkill;
            int graduationDate;
            String graduationRank;
            String universityName;
            String majors, university;
            int semester;
            switch (choice) {
                case 1:
                    do {
                        System.out.println(" Do you want to continue (Yes/No)?");
                        choice2 = scanner.nextLine();
                        switch (choice2) {
                            case "Yes":
                                System.out.println("Enter the information experience : id, birth date, phone, first name,  last name, address, email, expInYear,  proSkill");
                                System.out.print("Enter the id : ");
                                id = Integer.parseInt(scanner.nextLine());
                                System.out.println("Enter the birth year ");
                                for (int i = 0; i < birthYear.length; i++) {
                                    birthYearItem = Integer.parseInt(scanner.nextLine());
                                    birthYear[i] = birthYearItem;
                                }
                                System.out.print("Enter the phone : ");
                                for (int i = 0; i < phone.length; i++) {
                                    phoneItem = Integer.parseInt(scanner.nextLine());
                                    phone[i] = phoneItem;
                                }
                                System.out.print("Enter the first name : ");
                                firstName = scanner.nextLine();
                                System.out.print("Enter the last name : ");
                                lastName = scanner.nextLine();
                                System.out.print("Enter the address : ");
                                address = scanner.nextLine();
                                System.out.print("Enter the email : ");
                                email = scanner.nextLine();
                                System.out.print("Enter the expInYear : ");
                                value = Integer.parseInt(scanner.nextLine());
//                                while (value > 0 && value < 100) {
//                                    System.out.print("Enter the expInYear : ");
//                                    value = Integer.parseInt(scanner.nextLine());
//                                    System.err.println("Input wrong ");
//                                }
                                    if (value > 0 && value < 100) {
                                        expInYear = value;
                                    } else {
                                        System.err.println("Input wrong ");
                                    }
//                                }
                                System.out.print("Enter the proSkill : ");
                                proSkill = scanner.nextLine();

                                Experience experience = new Experience(id, birthYear, phone, firstName, lastName, address, email, expInYear, proSkill);
                                experienceArrayList.add(experience);
                                break;
                            case "No":
                                break;
                        }
                    } while (!choice2.equals("No"));
                    System.out.println(experienceArrayList);
                    break;
                case 2:
                    do {
                        System.out.println(" Do you want to continue (Yes/No)?");
                        choice2 = scanner.nextLine();
                        switch (choice2) {
                            case "Yes":
                                System.out.println("Enter the information experience : id, birth date, phone, first name,  last name, address, email, graduationDate,  graduationRank,universityName");
                                System.out.print("Enter the id : ");
                                id = Integer.parseInt(scanner.nextLine());
                                System.out.println("Enter the birth year ");
                                for (int i = 0; i < birthYear.length; i++) {
                                    birthYearItem = Integer.parseInt(scanner.nextLine());
                                    birthYear[i] = birthYearItem;
                                }
                                System.out.print("Enter the phone : ");
                                for (int i = 0; i < phone.length; i++) {
                                    phoneItem = Integer.parseInt(scanner.nextLine());
                                    phone[i] = phoneItem;
                                }
                                System.out.print("Enter the first name : ");
                                firstName = scanner.nextLine();
                                System.out.print("Enter the last name : ");
                                lastName = scanner.nextLine();
                                System.out.print("Enter the address : ");
                                address = scanner.nextLine();
                                System.out.print("Enter the email : ");
                                email = scanner.nextLine();
                                System.out.print("Enter the graduationDate : ");
                                graduationDate = Integer.parseInt(scanner.nextLine());
                                System.out.print("Enter the graduationRank : ");
                                graduationRank = scanner.nextLine();
                                System.out.print("Enter the universityName: ");
                                universityName = scanner.nextLine();
                                Fresher fresher = new Fresher(id, birthYear, phone, firstName, lastName, address, email, graduationDate, graduationRank, universityName);
                                freshersArrayList.add(fresher);
                                break;
                            case "No":
                                break;
                        }
                    } while (!choice2.equals("No"));
                    System.out.println(freshersArrayList);
                    break;
                case 3:
                    do {
                        System.out.println(" Do you want to continue (Yes/No)?");
                        choice2 = scanner.nextLine();
                        switch (choice2) {
                            case "Yes":
                                System.out.println("Enter the information experience : id, birth date, phone, first name,  last name, address, email, graduationDate,  graduationRank,universityName");
                                System.out.print("Enter the id : ");
                                id = Integer.parseInt(scanner.nextLine());
                                System.out.println("Enter the birth year ");
                                for (int i = 0; i < birthYear.length; i++) {
                                    birthYearItem = Integer.parseInt(scanner.nextLine());
                                    birthYear[i] = birthYearItem;
                                }
                                System.out.print("Enter the phone : ");
                                for (int i = 0; i < phone.length; i++) {
                                    phoneItem = Integer.parseInt(scanner.nextLine());
                                    phone[i] = phoneItem;
                                }
                                System.out.print("Enter the first name : ");
                                firstName = scanner.nextLine();
                                System.out.print("Enter the last name : ");
                                lastName = scanner.nextLine();
                                System.out.print("Enter the address : ");
                                address = scanner.nextLine();
                                System.out.print("Enter the email : ");
                                email = scanner.nextLine();
                                System.out.print("Enter the majors : ");
                                majors = scanner.nextLine();
                                System.out.print("Enter the university: ");
                                university = scanner.nextLine();
                                System.out.print("Enter the semester: ");
                                semester = Integer.parseInt(scanner.nextLine());
                                Intern intern = new Intern(id, birthYear, phone, firstName, lastName, address, email, majors, university, semester);
                                internsArrayList.add(intern);
                                break;
                            case "No":
                                break;
                        }
                    } while (!choice2.equals("No"));
                    System.out.println(internsArrayList);
                    break;
                case 4:
//                    display(experienceArrayList);
//                    display(freshersArrayList);
//                    display(internsArrayList);
                case 5:
                    System.exit(5);
                default:
                    System.err.println(" NO CHOICE ! ");
            }
        } while (choice != 5);
    }

//    public static void display(ArrayList list) {
//        int i;
//        System.out.print("[");
//
//        for (i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//
//        System.out.print("]\n");
//    }

}
