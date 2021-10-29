package l17_io_string_and_regex.exercise.validate_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {

    private static final String NAME_CLASS_REGEX =   "^[A-Z&&[CAP]]{1}\\d{4}[A-Z&&[GHIKLM]]{1}$";

    public NameClass() {
    }

    public boolean validateName(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
