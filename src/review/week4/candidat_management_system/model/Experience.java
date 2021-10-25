package review.week4.candidat_management_system.model;

import review.week4.candidat_management_system.service.impl.ExperienceService;

import java.util.concurrent.ExecutorService;

public class Experience extends Candidate  {
    private int expInYear;
    private String proSkill;

    public Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(int id, int birthDate, String phone, String firstName, String lastName, String address, String email, int expInYear, String proSkill) {
        super(id, birthDate, phone, firstName, lastName, address, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                super.toString() +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
