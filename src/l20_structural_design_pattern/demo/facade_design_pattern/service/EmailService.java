package l20_structural_design_pattern.demo.facade_design_pattern.service;

public class EmailService {
    public void sendMail(String mailTo) {
        System.out.println("Sending an email to " + mailTo);
    }
}
