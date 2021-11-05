package case_study.furama_resort.services;


import java.io.IOException;
import java.util.List;

public interface FileService extends Service{
    void writeBuffer(Object object, String path) throws IOException;
    List<Object> readBuffer(String path) throws IOException;
}
