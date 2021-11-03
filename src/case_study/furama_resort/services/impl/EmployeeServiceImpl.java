package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.Employee;
import case_study.furama_resort.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
   private static List<Employee> employeeList = new ArrayList<>();
   Scanner scanner = new Scanner(System.in);

    @Override
    public void displayEmployeeList() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public List<Employee> addEmployee() {
        System.out.print("Enter the employee Code ");
        String employeeCode = scanner.nextLine();
        System.out.print("Enter the standard ");
        String standard = scanner.nextLine();
        System.out.print("Enter the place ");
        String place = scanner.nextLine();
        System.out.print("Enter the salary ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(employeeCode,standard,place,salary);
        employeeList.add(employee);
        return employeeList;
    }

    @Override
    public List<Employee> updateEmployee(Employee employee) {
        //kiem tra 'product' co ton tai trong list studentList
        int index = employeeList.indexOf(employee);

        if (index == -1) {
            //'product' khong co trong list --> them 'product' vao list
//            addEmployee();
            System.err.println("not found");
        } else {
            employeeList.set(index,employee);
        }
        return employeeList;
    }
}
