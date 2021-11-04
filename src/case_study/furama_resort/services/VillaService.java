package case_study.furama_resort.services;

import case_study.furama_resort.models.Facility;

import java.io.IOException;

public interface VillaService extends FacilityService{
    Facility addVilla() throws IOException;
}
