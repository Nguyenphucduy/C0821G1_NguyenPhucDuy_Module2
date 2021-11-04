package case_study.furama_resort.services;


import java.io.IOException;
import java.util.List;

public interface FileService extends Service{
    void writeBuffer(Service service, String path) throws IOException;
    List<Service> readBuffer(String path) throws IOException;
}
