package l17_io_string_and_regex.exercise.validate_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexName {
    /*
    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P

     Không chứa các ký tự đặc biệt

     Theo sau ký tự bắt đầu là 4 ký tự số

     Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
     */
    public static final String REGEX_NAME = "^[A-Z&&[CAP]]{1}\\d{4}[A-Z&&[GHIKLM]]{1}$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_NAME); //class pattern để use regex
        String input = "C0321G";
        Matcher matcher = pattern.matcher(input); // check input đầu vào theo regex
        System.out.println(matcher.matches());
    }
}
