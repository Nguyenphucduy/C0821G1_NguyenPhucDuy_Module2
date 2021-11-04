package case_study.furama_resort.services;

import case_study.furama_resort.models.Facility;

import java.io.IOException;

public interface RoomService extends FacilityService{
    Facility addRoom() throws IOException;
}
