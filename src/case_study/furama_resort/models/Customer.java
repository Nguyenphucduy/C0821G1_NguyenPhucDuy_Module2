package case_study.furama_resort.models;

public class Customer extends Person {
    private String customerCode;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String fullName, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
    }

    public Customer(String customerCode, String customerType, String address) {
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String fullName, String dateOfBirth, String gender, String identityCardNumber, String phoneNumber, String email, String customerCode, String customerType, String address) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.customerCode + "," + this.customerType + "," + this.address;
    }
}
