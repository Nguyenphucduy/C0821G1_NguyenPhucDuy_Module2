package review.week5.model;

public class Intern extends Candidate {
    public static final int INTERN = 2;
    private String majors;
    private int semester;
    private String universityName;

    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String id, String firstName, String lastName, int yearOfBirth, String address, String phone, String email, String majors, int semester, String universityName) {
        super(id, firstName, lastName, yearOfBirth, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public static int getINTERN() {
        return INTERN;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.majors + "," + this.semester + "," + this.universityName;
    }
}
