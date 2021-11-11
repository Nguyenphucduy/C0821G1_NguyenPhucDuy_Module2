package case_study.furama_resort.services.impl;

import case_study.furama_resort.services.Service;
import case_study.furama_resort.untils.FileWriteRead;

import java.io.IOException;

public class ServiceImpl implements Service {
    FileWriteRead fileWriteRead = new FileWriteRead();
    @Override
    public void displayList() throws IOException {
        fileWriteRead.displayList();
    }
}
