package s16_io_text_file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileText {

    public static final String PATH_SOURCE_FILE = "D:\\WorkSpace\\03_Company\\02_CodeGym\\02_Class\\2021\\C0821G1\\Module_2\\SourceDemo\\src\\s16_io_text_file\\sourceFile.txt";
    public static final String PATH_TARGET_FILE = "D:\\WorkSpace\\03_Company\\02_CodeGym\\02_Class\\2021\\C0821G1\\Module_2\\SourceDemo\\src\\s16_io_text_file\\targetFile.txt";

    /*Buoc 1: doc duoc noi dung cua source file.*/
    public static String readFile(FileReader fileReader) throws IOException {
        int i;
        String result = "";
        while ((i = fileReader.read()) != -1){
            result += (char) i;
        }
        fileReader.close();
        return result;
    }

    /*Buoc 2: ghi noi dung da doc vao target file*/
    public static void writeFile(FileWriter fileWriter, String content){
        try {
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Write success!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        String result = "";
        try {
            result = readFile(new FileReader(PATH_SOURCE_FILE));
            System.out.println(result);

        } catch (IOException e) {
            System.out.println("Co loi doc file");
        }

        writeFile(new FileWriter(PATH_TARGET_FILE), result);
    }
}
