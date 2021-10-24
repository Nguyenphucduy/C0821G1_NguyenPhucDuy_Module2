package review.week4.candidat_management_system.service.impl;

public  class ExperienceService implements review.week4.candidat_management_system.service.ExperienceService {

    @Override
    public Integer exYear(int year) {
        if (year > 0 && year <100){
            return year;
        }
        return -1;
    }
}
