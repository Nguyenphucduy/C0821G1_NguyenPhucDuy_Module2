package case_study.furama_resort.services;

import case_study.furama_resort.models.Employee;

import java.util.List;

public interface EmployeeService extends Service{
    void displayEmployeeList();
    List<Employee> addEmployee();
    List<Employee> updateEmployee(Employee employee);
}
