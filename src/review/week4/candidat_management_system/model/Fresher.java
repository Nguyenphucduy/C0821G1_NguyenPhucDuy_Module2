package review.week4.candidat_management_system.model;

public class Fresher extends Candidate {
    private int graduationDate;
    private String graduationRank, universityName;

    public Fresher(int graduationDate, String graduationRank, String universityName) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = universityName;
    }

    public Fresher(int id, int birthDate, String phone, String firstName, String lastName, String address, String email, int graduationDate, String graduationRank, String universityName) {
        super(id, birthDate, phone, firstName, lastName, address, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = universityName;
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
        universityName = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                super.toString() +
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", Education='" + universityName + '\'' +
                '}';
    }
}
