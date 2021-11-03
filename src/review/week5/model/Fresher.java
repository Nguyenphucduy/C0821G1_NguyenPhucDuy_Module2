package review.week5.model;

public class Fresher extends Candidate {
    public static final int FRESHER = 1;
    private int graduationDate;
    private String graduationRank;
    private String universityName;

    public Fresher(int graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = education;
    }

    public Fresher(String id, String firstName, String lastName, int yearOfBirth, String address, String phone, String email, int graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, yearOfBirth, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = education;
    }

    public static int getFRESHER() {
        return FRESHER;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return universityName;
    }

    public void setEducation(String education) {
        this.universityName = education;
    }

    @Override
    public String toString() {
        return super.toString() + "," + graduationDate + "," + graduationRank + "," + universityName;
    }
}
