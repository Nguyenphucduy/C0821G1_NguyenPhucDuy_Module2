package review.week5.model;

public class Experience extends Candidate {
    public static final int EXPERIENCE = 0;
    private int exPlnYear;
    private String proSkill;


    public Experience(int id, String firstName, String lastName, int yearOfBirth, String address, String phone, String email, int exPlnYear, String proSkill) {
        super(id, firstName, lastName, yearOfBirth, address, phone, email);
        this.exPlnYear = exPlnYear;
        this.proSkill = proSkill;
    }

    public static int getEXPERIENCE() {
        return EXPERIENCE;
    }

    public int getExPlnYear() {
        return exPlnYear;
    }

    public void setExPlnYear(int exPlnYear) {
        this.exPlnYear = exPlnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.exPlnYear + "," + this.proSkill;
    }
}
