package case_study.furama_resort.models;

public class Employee extends Person {
    private String employeeCode;
    private String standard;
    private String place;
    private double salary;

    public Employee() {
    }

    public Employee(String fullName, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
    }

    public Employee(String employeeCode, String standard, String place, double salary) {
        this.employeeCode = employeeCode;
        this.standard = standard;
        this.place = place;
        this.salary = salary;
    }

    public Employee(String fullName, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String employeeCode, String standard, String place, double salary) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.standard = standard;
        this.place = place;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.employeeCode + "," + this.standard + "," + this.place + "," + this.salary;
    }
}
