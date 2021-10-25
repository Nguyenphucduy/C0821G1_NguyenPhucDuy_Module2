package review.week4.candidat_management_system.controller;

import review.week4.candidat_management_system.model.Experience;
import review.week4.candidat_management_system.model.Fresher;
import review.week4.candidat_management_system.model.Intern;

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
        int choice3;
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience ");
            System.out.println("2. Fresher ");
            System.out.println("3. Internship ");
            System.out.println("4. Searching ");
            System.out.println("5. Exit  ");
            System.out.print("Enter the choice : ");
            choice = Integer.parseInt(scanner.nextLine());
            int birthYear;
            String phone;
            int id;
            int expInYear;
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
                                do {
                                    System.out.println("Enter the year of birth between 1900 and 2021");
                                    birthYear = Integer.parseInt(scanner.nextLine());
                                } while (birthYear > 2021 || birthYear < 1900);
                                do {
                                    System.out.println("Enter the phone minimum 10 characters");
                                    phone = scanner.nextLine();
                                } while (phone.length() > 10);//  chưa xử lý được việc nhập chữ
                                System.out.print("Enter the first name : ");
                                firstName = scanner.nextLine();
                                System.out.print("Enter the last name : ");
                                lastName = scanner.nextLine();
                                System.out.print("Enter the address : ");
                                address = scanner.nextLine();
                                System.out.print("Enter the email : ");
                                email = scanner.nextLine();
                                do {
                                    System.out.print("Enter the expInYear of between 0 and 100 : ");
                                    expInYear = Integer.parseInt(scanner.nextLine());
                                } while (expInYear > 100 || expInYear < 0);

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
                                do {
                                    System.out.println("Enter the year of birth between 1900 and 2021");
                                    birthYear = Integer.parseInt(scanner.nextLine());
                                } while (birthYear > 2021 || birthYear < 1900);
                                do {
                                    System.out.println("Enter the phone minimum 10 characters");
                                    phone = scanner.nextLine();
                                } while (phone.length() > 10);
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
                                do {
                                    System.out.print("Enter the graduationRank (Excellence, Good, Fair, Poor) : ");
                                    graduationRank = scanner.nextLine();
                                } while (!graduationRank.equals("Excellence") && !graduationRank.equals("Good") && !graduationRank.equals("Fair") && !graduationRank.equals("Poor"));
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
                                do {
                                    System.out.println("Enter the year of birth between 1900 and 2021");
                                    birthYear = Integer.parseInt(scanner.nextLine());
                                } while (birthYear > 2021 || birthYear < 1900);
                                do {
                                    System.out.println("Enter the phone minimum 10 characters");
                                    phone = scanner.nextLine();
                                } while (phone.length() > 10);
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
                    do {
                        System.out.println("CANDIDATE MANAGEMENT SYSTEM SEARCHING");
                        System.out.println("1. Experience ");
                        System.out.println("2. Fresher ");
                        System.out.println("3. Internship ");
                        System.out.println("4. Return Menu ");
                        System.out.print("Enter the choice : ");
                        choice3 = Integer.parseInt(scanner.nextLine());
                        switch (choice3) {
                            case 1:
                                int i;
                                String name;
                                System.out.println("Enter the name you want check ");
                                name = scanner.nextLine();
                                int idCheck = 0;
                                boolean check = false;
                                for (i = 0; i < experienceArrayList.size(); i++) {
                                    if (name.equals(experienceArrayList.get(i).getFirstName()) || name.equals(experienceArrayList.get(i).getLastName())) {
                                        check = true;
                                        idCheck = i;
                                    } else {
                                        check = false;
                                    }
                                }
                                if (check) {
                                    System.out.println(" Have Experience with your name in the Array list is : " + experienceArrayList.get(idCheck));
                                } else {
                                    System.err.println("your name was not found in the array list");
                                }
                                break;
                            case 2:
                                int j;
                                String name2;
                                System.out.println("Enter the name you want check ");
                                name2 = scanner.nextLine();
                                int idCheck2 = 0;
                                boolean check2 = false;
                                for (j = 0; j < freshersArrayList.size(); j++) {
                                    if (name2.equals(freshersArrayList.get(j).getFirstName()) || name2.equals(freshersArrayList.get(j).getLastName())) {
                                        check2 = true;
                                        idCheck2 = j;
                                    } else {
                                        check2 = false;
                                    }
                                }
                                if (check2) {
                                    System.out.println(" Have Experience with your name in the Array list is : " + freshersArrayList.get(idCheck2));
                                } else {
                                    System.err.println("your name was not found in the array list");
                                }
                                break;
                            case 3:
                                int k;
                                String name3;
                                System.out.println("Enter the name you want check ");
                                name3 = scanner.nextLine();
                                int idCheck3 = 0;
                                boolean check3 = false;
                                for (k = 0; k < internsArrayList.size(); k++) {
                                    if (name3.equals(internsArrayList.get(k).getFirstName()) || name3.equals(internsArrayList.get(k).getLastName())) {
                                        check3 = true;
                                        idCheck3 = k;
                                    } else {
                                        check3 = false;
                                    }
                                }
                                if (check3) {
                                    System.out.println(" Have Experience with your name in the Array list is : " + internsArrayList.get(idCheck3));
                                } else {
                                    System.err.println("your name was not found in the array list");
                                }
                                break;
                            case 4:
                                break;
                            default:
                                System.err.println(" NO CHOICE ! ");

                        }
                    } while (choice3 != 4);
                    break;
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
