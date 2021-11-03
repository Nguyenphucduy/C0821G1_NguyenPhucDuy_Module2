package review.week5.model;

public abstract class Candidate {
    private String id;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String address;
    private String phone;
    private String email;

    public Candidate() {
    }

    public Candidate(String id, String firstName, String lastName, int yearOfBirth, String address, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.id + "," + this.firstName + "," + this.lastName + "," + this.yearOfBirth +"," + this.address + "," + this.phone + "," + this.email  ;
    }
}
