package s01_introduction_java;

public class Exercise1 {

    static int c;

    public static void main(String[] args) {
        byte a = 100;
        byte b = 200;
        /*Câu hỏi 1: giải thích tại sao line 9 bị lỗi ?  kiểu byte trong Java có phạm vi [-127, 127].
        * Sửa lại cho hết lỗi, những vẫn phải lưu được giá trị 200
         * đổi kiểu dữ liệu int b = 200;*/


        System.out.println(c);
        /*Câu hỏi 2: giá trị của biến c là bao nhiêu ? giải thích. giá trị của c là 0(giá trị mặc định của kiểu Integer)
       *vì Biến static có thể được sử dụng để tham chiếu thuộc tính chung của tất cả đối tượng (mà không là duy nhất cho mỗi đối tượng)*/


    }
}
