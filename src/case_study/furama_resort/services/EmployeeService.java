package case_study.furama_resort.services;

import java.io.IOException;

public interface EmployeeService extends Service{
    void displayEmployeeList();
    void addEmployee() throws IOException;
    void updateEmployee() throws IOException;
}
