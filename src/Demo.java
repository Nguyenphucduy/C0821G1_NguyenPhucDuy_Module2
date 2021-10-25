import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone;
        do {
            System.out.println("Enter the phone of between 99999999 and 999999999");
            phone = scanner.nextLine();
        } while (phone.length() > 10);
//        long phone2 = (long) phone;
        System.out.println(phone);
    }

}
