package review.week4.candidat_management_system.model;

public class Intern extends Candidate{
    private String majors,university;
    private int semester;

    public Intern(String majors, String university, int semester) {
        this.majors = majors;
        this.university = university;
        this.semester = semester;
    }

    public Intern(int id, int birthDate, String phone, String firstName, String lastName, String address, String email, String majors, String university, int semester) {
        super(id, birthDate, phone, firstName, lastName, address, email);
        this.majors = majors;
        this.university = university;
        this.semester = semester;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Intern{" +
                super.toString() +
                "majors='" + majors + '\'' +
                ", university='" + university + '\'' +
                ", semester=" + semester +
                '}';
    }
}
