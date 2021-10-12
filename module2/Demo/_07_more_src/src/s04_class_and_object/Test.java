package s04_class_and_object;

public class Test {
    public static void main(String[] args) {
//        int a = 5;
//        long b = a; //implicit casting
//        //muc dich: mở rộng khả năng lưu trữ - không mất mát dữ liệu
//
//        double c = 9.9;
//        int d = (int) c; //Explicit casting
//        //muc dich: thu hẹp khả năng lưu trữ - mất thông tin/data
//        System.out.println(d);

//        Fan fan = new Fan2(); //da hinh
//        Fan2 fan2 = new Fan2();

//        fan = fan2; //upcasting ~ implicit casting
//        fan2 = (Fan2) fan;

        Fan[] fanList = new Fan[3];
        fanList[0] = new Fan();
        fanList[1] = new Fan2();
        fanList[2] = new Fan3();

//        for (Fan fan : fanList) {
//            fan.showInfo();
//        }
        ((Fan2) fanList[1]).test_2();

    }
}
