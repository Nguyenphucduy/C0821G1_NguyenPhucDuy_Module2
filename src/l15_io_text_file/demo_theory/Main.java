package l15_io_text_file.demo_theory;

import l15_io_text_file.exercise.read_file_csv.model.Country;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void writeStudent(Student student) throws IOException {
        String string = student.toString();
        FileWriter fileWriter = new FileWriter("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l15_io_text_file\\demo_theory\\student.scv", true);// true tránh việc ghi đè
        fileWriter.write(string);
        fileWriter.write("\n");
        fileWriter.close();
    }
    public static void writeStudentBuffer(Student student) throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l15_io_text_file\\demo_theory\\student.scv", true);// true tránh việc ghi đè
       BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
       bufferedWriter.write(student.toString());
       bufferedWriter.newLine();
       bufferedWriter.close();
    }

    public static List<Student> readStudent() throws IOException {
        List<Student> studentList = new ArrayList<Student>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader("E:\\Duy Win\\Java- Fullstack\\Intellij\\src\\l15_io_text_file\\demo_theory\\student.scv");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Student student;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]), temp[1], temp[2]);
                studentList.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close(); // close buffer - > tự động close FileRead
        }
        return studentList;


    }

    public static void main(String[] args) throws IOException {
        List<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student(1, "bob", "VN");
        Student student = new Student(2, "bob2", "VN2");
        studentList.add(student1);
        studentList.add(student);
//        writeStudent(student);
//        writeStudent(student1);
//        List<Student> studentList1 = readStudent();
//        for (Student student2 : studentList1){
//            System.out.println(student2);
//        }
        writeStudentBuffer(student);
    }
}
