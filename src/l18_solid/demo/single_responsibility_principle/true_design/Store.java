package l18_solid.demo.single_responsibility_principle.true_design;

/**
 * Class Store nhận nhiệm vụ lưu trữ dữ liệu
 */
public class Store { //package: service
    public void saveToDatabase(Student std) {
        System.out.println("Code lưu trữ dữ liệu vào database");
    }
    public void saveToFile(Student std) {
        System.out.println("Code lưu trữ dữ liệu vào File");
    }
}