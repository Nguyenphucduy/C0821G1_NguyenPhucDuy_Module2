package l17_io_string_and_regex.demo.string;

public class Main {
    public static void main(String[] args) {
        // Demo String:
//        String a = "hello";
//        String b = "hello";
        String a = new String(" hello");
        String b = new String(" hello");
//        System.out.println(a==b);  // -> true vùng nhớ String pool(heap)
//        System.out.println(a==b); // -> false 2 vùng nhớ riêng biệt(heap)
    }
}
