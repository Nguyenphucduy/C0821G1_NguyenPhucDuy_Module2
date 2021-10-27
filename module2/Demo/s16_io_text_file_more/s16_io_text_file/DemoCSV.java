package s16_io_text_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DemoCSV {

    public static List<Country> readCSV(){
        List<Country> countryList = new ArrayList<>();
        BufferedReader buffRead = null;

        try {
            FileReader fileReader = new FileReader("D:\\WorkSpace\\03_Company\\02_CodeGym\\02_Class\\2021\\C0821G1\\Module_2\\SourceDemo\\src\\s16_io_text_file\\demo.csv");
            buffRead = new BufferedReader(fileReader);

            String line;
            String[] temp;
            Country country;
            while ((line = buffRead.readLine()) != null){
                temp = line.split(",");
                country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
                countryList.add(country);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                buffRead.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return countryList;
    }

    public static void main(String[] args) {
        List<Country> countryList = readCSV();
        for (Country country: countryList){
            System.out.println(country);
        }
    }
}
