package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Employee;
import case_study.furama_resort.services.EmployeeService;
import case_study.furama_resort.untils.FileWriteRead;
import case_study.furama_resort.untils.Validate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
   private static List<Employee> employeeList ;
   Scanner scanner = new Scanner(System.in);
   FileWriteRead fileWriteRead = new FileWriteRead();

    public EmployeeServiceImpl() throws IOException {
        employeeList = new ArrayList<>();
//        employeeList.add((Employee) fileWriteRead.readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\employee.csv"));
    }

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setEmployeeList(List<Employee> employeeList) {
        EmployeeServiceImpl.employeeList = employeeList;
    }

    @Override
    public void displayEmployeeList() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addEmployee() throws IOException {
        try {
            System.out.print("Enter the full name: ");
            String fullName = scanner.nextLine();
            System.out.print("Enter the date of birth :  ");
            String dateOfBirth = scanner.nextLine();
            String gender = Validate.inputGender();
            System.out.print("Enter the identity Card Number: ");
            String identityCardNumber = scanner.nextLine();
            String phoneNumber = Validate.inputPhoneNumber();
            String email = Validate.inputEmail();
            System.out.print("Enter the employee Code: ");
            String employeeCode = scanner.nextLine();
            String standard = Validate.inputStandard();
            String place = Validate.inputPlace();
            double salary = Validate.inputSalary();
            Employee employee = new Employee(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email, employeeCode, standard, place, salary);
            employeeList.add(employee);
            fileWriteRead.writeBuffer(employee, "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\employee.csv");
        }catch (Exception e){
            System.err.println("Error");
        }
    }

    @Override
    public void updateEmployee() throws IOException {
        try {
            System.out.print("Enter the index you want update : ");
            int index = Integer.parseInt(scanner.nextLine());
            index = employeeList.indexOf(employeeList.get(index));

            if (index == -1) {
                System.err.println("not found");
            } else if (index < employeeList.size()) {
                System.out.print("Enter the update full name: ");
                String fullName = scanner.nextLine();
                employeeList.get(index).setFullName(fullName);
                System.out.print("Enter the update date of birth :  ");
                String dateOfBirth = scanner.nextLine();
                employeeList.get(index).setDateOfBirth(dateOfBirth);
                String gender = Validate.inputGender();
                employeeList.get(index).setGender(gender);
                System.out.print("Enter the update identity Card Number: ");
                String identityCardNumber = scanner.nextLine();
                employeeList.get(index).setIdentityCardNumber(identityCardNumber);
                String phoneNumber = Validate.inputPhoneNumber();
                employeeList.get(index).setPhoneNumber(phoneNumber);
                String email = Validate.inputEmail();
                employeeList.get(index).setEmail(email);
                System.out.print("Enter update the employee Code : ");
                String employeeCode = scanner.nextLine();
                employeeList.get(index).setEmployeeCode(employeeCode);
                String standard = Validate.inputStandard();
                employeeList.get(index).setStandard(standard);
                String place = Validate.inputPlace();
                employeeList.get(index).setPlace(place);
                double salary = Validate.inputSalary();
                employeeList.get(index).setSalary(salary);
                employeeList.set(index, employeeList.get(index));
                fileWriteRead.writeBuffer(employeeList.get(index), "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\employee.csv");
            }
            System.out.println("update done ---------------------------------------------------------");
            System.out.print(employeeList.get(index));
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
