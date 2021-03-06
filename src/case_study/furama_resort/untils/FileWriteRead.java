package case_study.furama_resort.untils;

import case_study.furama_resort.models.*;
import case_study.furama_resort.services.FileService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRead implements FileService {
    @Override
    public void writeBuffer(Object object, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(object.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    @Override
    public List<Object> readBuffer(String path) throws IOException {
        List<Object> objectList = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Employee employee;
            Customer customer;
            Facility villa,house,room;
            Booking booking;
            Contract contract;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 10) {
                    employee = new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], Double.parseDouble(temp[9]));
                    objectList.add(employee);
                } else if (temp.length == 9) {
                    if (temp[0].startsWith("V")) {
                        villa = new Villa(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6], Double.parseDouble(temp[7]), Integer.parseInt(temp[8]));
                        objectList.add(villa);
                    } else {
                        customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                        objectList.add(customer);
                    }
                } else if (temp.length == 8) {
                    house = new House(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]));
                    objectList.add(house);
                } else if (temp.length == 7) {
                    room = new Room(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6]);
                    objectList.add(room);
                } else if (temp.length == 6) {
                    booking = new Booking(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), temp[3], temp[4], temp[5]);
                    objectList.add(booking);
                } else if (temp.length == 5) {
                    contract = new Contract(Integer.parseInt(temp[0]),temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), (temp[4]));
                    objectList.add(contract);
                }

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return objectList;
    }

    @Override
    public void displayList() throws IOException {
        List<Object> employeeList = readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\employee.csv");
        System.err.println(" employee ------------------------------------------------------------------");
        for (Object service : employeeList) {
            System.err.println(service);
        }
        List<Object> customerList = readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\customer.csv");
        System.err.println("customer ------------------------------------------------------------------");
        for (Object service : customerList) {
            System.err.println(service);
        }
        List<Object> roomList = readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\room.csv");
        System.err.println("room -------------------------------------------------------------------");
        for (Object service : roomList) {
            System.err.println(service);
        }
        List<Object> houseList = readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\house.csv");
        System.err.println("house -------------------------------------------------------------------");
        for (Object service : houseList) {
            System.err.println(service);
        }
        List<Object> villaList = readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\villa.csv");
        System.err.println("villa -------------------------------------------------------------------");
        for (Object service : villaList) {
            System.err.println(service);
        }
        List<Object> bookingList = readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\booking.csv");
        System.err.println("booking-------------------------------------------------------------------");
        for (Object service : bookingList) {
            System.err.println(service);
        }
        List<Object> contractList = readBuffer("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\case_study\\furama_resort\\data\\contract.csv");
        System.err.println("villa contract -------------------------------------------------------------------");
        for (Object service : contractList) {
            System.err.println(service);
        }
    }
}
