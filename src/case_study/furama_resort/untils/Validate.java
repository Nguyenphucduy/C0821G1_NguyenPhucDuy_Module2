package case_study.furama_resort.untils;

import case_study.furama_resort.untils.excepcition.MyException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static String inputCodeService() {
        String codeService = null;
        try {
            System.out.print("Enter the code service : ");
            codeService = scanner.nextLine();
            if (codeService.length() == 0) {
                throw new MyException("not null");
            }
            while (!Pattern.matches("^[A-Z&&[RVH]]{1}[0-9]+$", codeService)) {
                System.out.print("Enter the code service : ");
                codeService = scanner.nextLine();
            }
        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return codeService;
    }

    public static String inputNameService() {
        String nameService = null;
        try {
            System.out.print("Enter the name service : ");
            nameService = scanner.nextLine();
            while (!Pattern.matches("^[A-Z]{1}[a-z]+$", nameService)) {
                System.out.print("Enter the name service : ");
                nameService = scanner.nextLine();
            }
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return nameService;
    }

    public static double inputArea() {
        double area = 0;
        try {
            do {
                System.out.print("Enter the Area  > 30: ");
                area = Double.parseDouble(scanner.nextLine());
            } while (area < 30);
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return area;
    }

    public static double inputRentCost() {
        double rentCost = 0;
        try {
            do {
                System.out.print("Enter the rent Cost > 0: ");
                rentCost = Double.parseDouble(scanner.nextLine());
            } while (rentCost < 0);
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return rentCost;
    }

    public static int inputNumberOfPeople() {
        int numberOfPeople = 0;
        try {
            do {
                System.out.print("Enter the number Of People: ");
                numberOfPeople = Integer.parseInt(scanner.nextLine());
            } while (numberOfPeople < 0 || numberOfPeople > 20);
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return numberOfPeople;
    }
    public static int inputStartDay() {
        int startDay = 0;
        try {
            do {
                System.out.print("Enter the start Day : ");
                startDay = Integer.parseInt(scanner.nextLine());
            } while (startDay < 0 || startDay > 31);
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return startDay;
    }
    public static int inputEndDay() {
        int endDay = 0;
        try {
            do {
                System.out.print("Enter the end Day : ");
                endDay = Integer.parseInt(scanner.nextLine());
            } while (endDay < 0 || endDay > 31);
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return endDay;
    }

    public static int inputNumberOfFloor() {
        int numberOfFloors = 0;
        try {
            do {
                System.out.print("Enter the number Of Floors > 0: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
            } while (numberOfFloors < 0);
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return numberOfFloors;
    }
    public static double inputSalary() {
        double salary = 0;
        try {
            do {
                System.out.print("Enter the salary > 0: ");
                salary = Double.parseDouble(scanner.nextLine());
            } while (salary < 0);
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return salary;
    }

    public static String inputRoomStandard() {
        String roomStandard = null;
        System.out.println("Choice  roomStandard ");
        System.out.println("1. 1 star room");
        System.out.println("2. 2 star room");
        System.out.println("3. 3 star room");
        System.out.println("4. 4 star room");
        System.out.println("5. 5 star room");
        System.out.print("Enter your choice : ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    roomStandard = "1star";
                    break;
                case 2:
                    roomStandard = "2star";
                    break;
                case 3:
                    roomStandard = "3star";
                    break;
                case 4:
                    roomStandard = "4star";
                    break;
                case 5:
                    roomStandard = "5star";
                    break;
            }
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return roomStandard;
    }

    public static String inputRentalType() {
        String rentalType = null;
        System.out.println("Choice  rentalType ");
        System.out.println("1. rent by the hour");
        System.out.println("2. rent by the day");
        System.out.println("3. rent by the month");
        System.out.println("4. rent by the year");
        System.out.print("Enter your choice : ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    rentalType = "hour";
                    break;
                case 2:
                    rentalType = "day";
                    break;
                case 3:
                    rentalType = "month";
                    break;
                case 4:
                    rentalType = "year";
                    break;
            }
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return rentalType;
    }
    public static String inputServiceType() {
        String ServiceType = null;
        System.out.println("Choice  Service Type ");
        System.out.println("1. New Villa");
        System.out.println("2. New House");
        System.out.println("3. New Room");
        System.out.print("Enter your choice : ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ServiceType = "Villa";
                    break;
                case 2:
                    ServiceType = "House";
                    break;
                case 3:
                    ServiceType = "Room";
                    break;
            }
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return ServiceType;
    }
    public static String inputStandard() {
        String standard = null;
        System.out.println("Choice  standard ");
        System.out.println("1. Secondary schools");
        System.out.println("2. Junior college");
        System.out.println("3. college degree");
        System.out.println("4. graduate degree");
        System.out.print("Enter your choice : ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    standard = "SecondarySchools";
                    break;
                case 2:
                    standard = "JuniorCollege";
                    break;
                case 3:
                    standard = "collegeDegree";
                    break;
                case 4:
                    standard = "graduateDegree";
                    break;
            }
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return standard;
    }
    public static String inputPlace() {
        String place = null;
        System.out.println("Choice  place ");
        System.out.println("1. protocol");
        System.out.println("2. serve");
        System.out.println("3. professional");
        System.out.println("4. supervise");
        System.out.println("5. manager");
        System.out.println("6. boss");
        System.out.print("Enter your choice : ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    place = "protocol";
                    break;
                case 2:
                    place = "serve";
                    break;
                case 3:
                    place = "professional";
                    break;
                case 4:
                    place = "supervise";
                    break;
                case 5:
                    place = "manager";
                    break;
                case 6:
                    place = "boss";
                    break;
            }
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return place;
    }
    public static String inputCustomerType() {
        String customerType = null;
        System.out.println("Choice  customerType ");
        System.out.println("1. Diamond");
        System.out.println("2. Platinium");
        System.out.println("3. Gold");
        System.out.println("4. Silver");
        System.out.println("5. Member");
        System.out.print("Enter your choice : ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerType = "Diamond";
                    break;
                case 2:
                    customerType = "Platinium";
                    break;
                case 3:
                    customerType = "Gold";
                    break;
                case 4:
                    customerType = "Silver";
                    break;
                case 5:
                    customerType = "Member";
                    break;
            }
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return customerType;
    }
    public static String inputGender() {
        String gender = null;
        System.out.println("Choice  gender ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.print("Enter your choice : ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;
            }
        } catch (Exception exception) {
            System.err.println("Error");
        }
        return gender;
    }
    static public String inputPhoneNumber() {
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
    static public String inputDateOfBirth() {
        String dateOfBirth = null;
        try {
            System.out.print("Enter a date Of Birth (dd/mm/YYYY)  : ");
            dateOfBirth = scanner.nextLine();
            while (!Pattern.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", dateOfBirth)) {
                System.out.println("No matches");
                System.out.print("Enter a date Of Birth (dd/mm/YYYY) : ");
                dateOfBirth = scanner.nextLine();
            }
        }catch (Exception exception){
            System.err.println("Error");
        }
        return dateOfBirth;
    }
    static public String identityCardNumber() {
        String identityCardNumber = null;
        try {
            System.out.print("Enter a identityCardNumber number starting with 0220 and only 12 numbers : ");
            identityCardNumber = scanner.nextLine();
            while (!Pattern.matches("^0220\\d{8}$", identityCardNumber)) {
                System.out.println("No matches");
                System.out.print("Enter a identityCardNumber number starting with 0220 and only 12 numbers: ");
                identityCardNumber = scanner.nextLine();
            }
        }catch (Exception exception){
            System.err.println("Error");
        }
        return identityCardNumber;
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
}
