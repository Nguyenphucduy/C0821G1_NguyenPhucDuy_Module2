package l15_io_text_file.exercise.copy_file_text.controller;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText {

    public static final String PATH_SOURCE_FILE = "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l15_io_text_file\\exercise\\copy_file_text\\controller\\sourceFile.txt";
    public static final String PATH_TARGET_FILE = "E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l15_io_text_file\\exercise\\copy_file_text\\controller\\targetFile.txt";

    /*Bước 1: Đọc được nội dung của source file*/
    public static String readFile(FileReader fileReader) throws IOException {// đọc file dùng FileReader
//        fileReader.read() // Ctrl đọc read()
        int count; // biến đếm
        String result = "";
        while ((count = fileReader.read()) != -1) {
            result += (char) count; // ép tường minh từ int - > char
        }
        fileReader.close();// đọc xong phải đóng
        return result;

    }
    /*
    Đọc file theo kí tự
    B1: Tạo 1 file và copy đường dẫn
    B2: tạo 1 biến result và new 1 đối tượng FileReader paste đường dẫn
    B3:dùng đối tượng fileReader gọi method read() đọc đến khi -1 = null
    B4: thực hiện cộng chuỗi và ép kiểu từ int - > char
    B5: Đóng chưa trình và return
     */

    /*Bước 2: ghi-viết nội dung vào target file*/
    public static void writeFile(FileWriter fileWriter, String content) { // FileWriter  đối tượng dùng để ghi,cần nội dung-> chuỗi đầu vào
        try {
            fileWriter.write(content); // write() để ghi - viết
            fileWriter.close();// ghi xong cũng phải đóng
            System.out.println(" write done . OK ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
     /*
    ghi file
    B1: dùng đối tượng fileWiter. gọi method write() và truyền nội dung muốn ghi vào
    B2: Đóng file
    B3: test-> new 1 đối tượng FileWrite(Paste đường dẫn muốn lưu) vào truyền vào nội dung muốn ghi
     */

    public static void main(String[] args) {
        try {
            String result = readFile(new FileReader(PATH_SOURCE_FILE)); // new FileReader đọc file không tự tạo được
            System.out.println(result);
            writeFile(new FileWriter(PATH_TARGET_FILE), result); // new FileWrite viết java tự tạo file theo link nếu chưa có
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
