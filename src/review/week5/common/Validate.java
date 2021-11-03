package review.week5.common;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    public static String inputID(){
        String id = null;
        try {
            System.out.print("Enter the id starting with E,F or I : ");
             id = scanner.nextLine();
            while (!Pattern.matches("^[A-Z&&[EFI]]{1}\\d{4}$", id)) {
                System.out.print("Enter the id starting with E,F or I : ");
                id = scanner.nextLine();
            }
        }catch (Exception exception){
            System.err.println("Error");
        }
        return id;
    }

    public static String inputEmail() {
        String email = null;
        try {
            System.out.print("Enter the email : ");
           email = scanner.nextLine();
            while (!Pattern.matches("^\\w+@\\w+(\\.\\w+){1,2}$", email)) {
                System.out.print("Enter the email : ");
                email = scanner.nextLine();
            }
        }catch (Exception exception){
            System.err.println("Error");
        }
        return email;


    }

    public static int inputYearOfBirth() {
        int yearOfBirth = 0;
        try {
            do {
                System.out.print("Enter the year of birth between 1900 and 2021 : ");
                yearOfBirth = Integer.parseInt(scanner.nextLine());
            } while (yearOfBirth > 2021 || yearOfBirth < 1900);
        }catch (Exception exception){
            System.err.println("Error");
        }
        return yearOfBirth;
    }

    static public String inputPhone() {
        String phone = null;
        try {
            System.out.print("Enter a phone number starting with 0 : ");
            phone = scanner.nextLine();
            while (!Pattern.matches("^0\\d{9}$", phone)) {
                System.out.println("No matches");
                System.out.print("Enter a phone number starting with 0 : ");
                phone = scanner.nextLine();
            }
        }catch (Exception exception){
            System.err.println("Error");
        }
        return phone;
    }

    public static int inputExpInYear() {
        int expInYear = 0;
        try {
            do {
                System.out.print("Enter the expInYear of between 0 and 100 : ");
                expInYear = Integer.parseInt(scanner.nextLine());
            } while (expInYear > 100 || expInYear < 0);
        }catch (Exception exception){
            System.err.println("Error");
        }
        return expInYear;
    }

    public static String inputGraduationRank() {
        String graduationRank = null;
        System.out.println("Choice Graduation Rank");
        System.out.println("1. Excellent");
        System.out.println("2. Good");
        System.out.println("3. Fair");
        System.out.println("4. Poor");
        System.out.print("Enter your choice : ");
        try{
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                graduationRank = "Excellent";
                break;
            case 2:
                graduationRank = "Good";
                break;
            case 3:
                graduationRank = "Fair";
                break;
            case 4:
                graduationRank = "Poor";
                break;
        }
        }catch (Exception exception){
            System.err.println("Error");
        }
        return graduationRank;
    }
}
