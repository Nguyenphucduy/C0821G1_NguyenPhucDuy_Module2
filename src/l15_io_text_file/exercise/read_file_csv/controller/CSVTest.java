package l15_io_text_file.exercise.read_file_csv.controller;

import l15_io_text_file.exercise.read_file_csv.model.Country;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVTest {

    public static final String PATH_CONTRY = "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l15_io_text_file\\exercise\\read_file_csv\\country.csv";

   /*
   Cách đọc file theo dòng dùng BufferedReader (class bộ nhớ đệm)
   Bước 1: Cũng tạo 1 đối tượng FileReader và paste đường dẫn file cần đọc
   Bước 2: Tạo 1 List để chứa các đối tượng theo từng line
   Bước 3: Tạo 1 biến String line và cho đối tượng buffered.readLine() đọc đến khi bằng null
   Bước 4: Sử dụng biến mảng temp tạm để cắt dấu "," từ line thành các phần tử
   Bước 5: Tạo mới 1 đối tượng của list để lưu các phần tử tương ứng với từng line
   Bước 6: thêm đối tượng vừa tạo vào List và đóng buffer bộ nhớ đệm -> FileRead tự động đóng
    */
    public static List<Country> readCSV() throws IOException {
        BufferedReader bufferedReader = null;
        List<Country> countryList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH_CONTRY);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Country country;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
                countryList.add(country);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            assert bufferedReader != null;
            bufferedReader.close(); // close buffer - > tự động close FileRead
        }
        return countryList;
    }

    public static void main(String[] args) throws IOException {
        List<Country> countryList = readCSV();
        for (Country country : countryList){
            System.out.println(country);
        }

    }

}
