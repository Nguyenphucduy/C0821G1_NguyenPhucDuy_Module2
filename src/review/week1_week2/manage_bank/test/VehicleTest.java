package review.week1_week2.manage_bank.test;

import review.week1_week2.manage_bank.superclass.Vehicle;

import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Menu");
            System.out.println("1. Create vehicle objects and enter information");
            System.out.println("2. Export tax declarations of vehicles.");
            System.out.println("3. Exit");
            System.out.print("Enter your choose: ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Enter the value of the car in dollars  : ");
                    double carValue = scanner.nextDouble();
                    System.out.print("Enter the vehicle capacity: ");
                    int cc = scanner.nextInt();
                    Vehicle vehicle = new Vehicle(carValue,cc);
                    System.out.println(vehicle);
                    break;
                case 2:
                    System.out.println("Under 100cc, 1% tax of the car's value.");
                    System.out.println("From 100 to 200cc, 3% tax of the car's value..");
                    System.out.println("Over 200cc, 5% tax of the car's value.");
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("No choose!");

            }
        }while (choose != 3) ;
    }
}
