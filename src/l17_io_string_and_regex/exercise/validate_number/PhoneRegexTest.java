package l17_io_string_and_regex.exercise.validate_number;

import l17_io_string_and_regex.exercise.validate_name_class.NameClass;

public class PhoneRegexTest {
    private static PhoneRegex phoneRegex;
    public static final String[] validPhone = new String[]{"(84)-(0978489648)" , "(84)-(0978488648)"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)", "(a8)-(33333333)"};

    public static void main(String args[]) {
        phoneRegex = new PhoneRegex();
        for (String phone : validPhone) {
            boolean isvalid = phoneRegex.validatePhone(phone);
            System.out.println("name is " + phone + " is valid: " + isvalid);
        }
        for (String phone : invalidPhone) {
            boolean isvalid = phoneRegex.validatePhone(phone);
            System.out.println("name is " + phone + " is valid: " + isvalid);
        }
    }
}
