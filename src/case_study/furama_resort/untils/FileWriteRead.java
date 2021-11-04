package case_study.furama_resort.untils;

import case_study.furama_resort.models.*;
import case_study.furama_resort.services.FileService;
import case_study.furama_resort.services.Service;;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriteRead implements FileService {
    @Override
    public void writeBuffer(Service service, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(service.toString());
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    @Override
    public List<Service> readBuffer(String path) throws IOException {
        List<Service> serviceList = new ArrayList<>();
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Service employee,customer,villa,house,room,booking,contract;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 10) {
                    employee =  new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8],Double.parseDouble(temp[9]));
                    serviceList.add(employee);
                } else if (temp.length == 9) {
                    if (temp[0].startsWith("V")){
                        villa = new Villa(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6], Double.parseDouble(temp[7]), Integer.parseInt(temp[8]));
                        serviceList.add(villa);
                    }else {
                        customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                        serviceList.add(customer);
                    }
                }else if (temp.length == 8){
                    house = new House(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5], temp[6], Integer.parseInt(temp[7]));
                    serviceList.add(house);
                }else if (temp.length == 7) {
                    room = new Room(temp[0], temp[1], Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), temp[5],temp[6]);
                    serviceList.add(room);
                }else if (temp.length==6){
                    booking = new Booking(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), temp[3], temp[4], temp[5]);
                    serviceList.add(booking);
                }else if (temp.length==5){
                    contract = new Contract(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), (temp[4]));
                    serviceList.add(contract);
                }

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return serviceList ;
    }
}
