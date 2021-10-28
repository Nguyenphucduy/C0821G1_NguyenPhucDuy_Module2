package l17_io_string_and_regex.exercise.validate_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhone {
    /**
     * Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
     *
     * x là ký tự số
     *
     * Không chứa các ký tự đặc biệt
     *
     * Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
     *
     * Ví dụ tên lớp không hợp lệ: (a8)-(22222222)
     */
    public static final String REGEX_PHONE_NUMBER = "^\\(84\\)\\-\\(0\\d{9}\\)$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER); //class pattern để use regex
        String input = "(84)-(0978489648)";
        Matcher matcher = pattern.matcher(input); // check input đầu vào theo regex
        System.out.println(matcher.matches());
    }
}
