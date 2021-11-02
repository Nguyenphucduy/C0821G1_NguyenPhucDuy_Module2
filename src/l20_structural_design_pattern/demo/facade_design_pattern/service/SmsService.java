package l20_structural_design_pattern.demo.facade_design_pattern.service;

public class SmsService {
    public void sendSMS(String mobilePhone) {
        System.out.println("Sending an mesage to " + mobilePhone);
    }
}
