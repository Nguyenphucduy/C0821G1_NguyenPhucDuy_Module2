package case_study.furama_resort.services;

import case_study.furama_resort.models.Facility;

import java.io.IOException;

public interface HouseService extends FacilityService{
    Facility addHouse() throws IOException;
}
