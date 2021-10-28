package l17_io_string_and_regex.exercise.validate_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_CLASS_REGEX =   "^C[0-9]{4}G$";

    public NameClass() {
        pattern = Pattern.compile(NAME_CLASS_REGEX);
    }

    public boolean validateName(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
