package l17_io_string_and_regex.exercise.validate_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneRegex {
    private static final String PHONE_REGEX =   "^\\(84\\)\\-\\(0\\d{9}\\)$";

    public PhoneRegex() {
    }

    public boolean validatePhone(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
