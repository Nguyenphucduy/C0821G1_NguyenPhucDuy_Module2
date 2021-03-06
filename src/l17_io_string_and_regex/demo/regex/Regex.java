package l17_io_string_and_regex.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    //tên phải có ít nhất là 6 ký tự, và dài nhất là 12 ký tự
    public static final String REGEX_NAME = "^[a-zA-Z ]{6,12}$";
    //Email abc@levunguyen.com.vn
    public static final String REGEX_EMAIL = "^\\w+@\\w+(\\.\\w+){1,2}$";
    //Số điện thoại
    public static final String REGEX_PHONE_NUMBER = "^84\\d{7}$";
    public static final String REGEX_CODE = "^(VL|HO|RO)\\d{4}$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_CODE); //class pattern để use regex
        String input = "RO1234";
        Matcher matcher = pattern.matcher(input); // check input đầu vào theo regex
        System.out.println(matcher.matches());
    }
}
