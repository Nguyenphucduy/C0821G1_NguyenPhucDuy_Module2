package review.week4.candidat_management_system.model;

import java.util.Arrays;

public class Candidate {
    public static final int EXPERIENCE = 0;
    public static final int FRESHER = 1;// constant of class with static
    public static final int INTERN = 2;
    private int id;
    private int[] birthDate, phone;
    private String firstName, lastName, address, email;

    public Candidate() {
    }

    public Candidate(int id, int[] birthDate, int[] phone, String firstName, String lastName, String address, String email) {
        this.id = id;
        this.birthDate = birthDate;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public static int getEXPERIENCE() {
        return EXPERIENCE;
    }

    public static int getFRESHER() {
        return FRESHER;
    }

    public static int getINTERN() {
        return INTERN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int[] birthDate) {
        this.birthDate = birthDate;
    }

    public int[] getPhone() {
        return phone;
    }

    public void setPhone(int[] phone) {
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", birthDate=" + Arrays.toString(birthDate) +
                ", phone=" + Arrays.toString(phone) +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
