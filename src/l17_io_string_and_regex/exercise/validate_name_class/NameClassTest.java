package l17_io_string_and_regex.exercise.validate_name_class;

public class NameClassTest {
    private static NameClass nameClass;
    public static final String[] validName = new String[] { "C0321G", "C0421G", "C0521G" };
    public static final String[] invalidName = new String[] { "C0821G1 " , "C0721G1", "C0621G1" };

    public static void main(String args[]) {
        nameClass = new NameClass();
        for (String name : validName) {
            boolean isvalid = nameClass.validateName(name);
            System.out.println("name is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = nameClass.validateName(name);
            System.out.println("name is " + name  +" is valid: "+ isvalid);
        }
    }
}

