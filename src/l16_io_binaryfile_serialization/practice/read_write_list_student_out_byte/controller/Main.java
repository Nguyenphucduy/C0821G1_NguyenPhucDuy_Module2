package l16_io_binaryfile_serialization.practice.read_write_list_student_out_byte.controller;

import l16_io_binaryfile_serialization.practice.read_write_list_student_out_byte.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Ghi Đối tượng ra file nhị phân
    Bước 1: tạo 1 đối tượng từ class triển khai FileOutputStream và truyền vào đường dẫn cần lưu
    Bước 2: tạo 1 đối tượng từ class bộ nhớ đệm ObjectOutputStream và truyền vào đối tượng file cần ghi
    Bước 3: từ đối tượng ObjectOutputStream.writeObject(truyền vào đối tượng cần ghi)
    Bước 4 : đóng cả 2 file từ class bộ nhớ đệm và class bình thường
     */
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path); // thêm true để ghi tiếp
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    Đọc đối tượng từ file nhị phân
    Bước 1: Tạo 1 List để lưu các đối tượng đọc được
    Bước 2: Tạo 1 đối tượng từ class triển khai  FileInputStream (đường dẫn cần đọc)
    Bước 3: tạo 1 đối tượng từ class bộ nhớ đệm ObjectInputStream (đối tượng file cần đọc)
    Bước 4: Gọi list và truyền vào generic kiểu đối tượng đó (hoặc ép kiểu) và gọi ois.readObject()
    Bước 5 : đóng cả 2 file lại và return List
     */
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }

    }
}
