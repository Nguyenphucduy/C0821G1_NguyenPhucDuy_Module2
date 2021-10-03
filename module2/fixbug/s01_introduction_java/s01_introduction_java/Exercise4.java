package s01_introduction_java;

public class Exercise4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        if (a++ > 2 || ++b < 3){
            a += 1;
        }

        System.out.println(a);
        System.out.println(b);

        /*Câu 5: Tại line 7 nếu thay || thành && thì kết quả tại line 11 và 12 có khác nhau không ?
        * kết quả giá trị b thay đổi b = 3 vì khi thay && giá trị của biểu thức điều kiện sai nên ++b k tăng thêm giá trị.
         * nhưng kết thúc biểu thức điều kiện a++ vẫn tăng thêm 1 giá trị
         * giải thích ?*/
    }
}
