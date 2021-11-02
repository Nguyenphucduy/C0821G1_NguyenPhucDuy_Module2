package ss21_structural_design_pattern.facade_design_pattern.service;

public class SmsService {
    public void sendSMS(String mobilePhone) {
        System.out.println("Sending an mesage to " + mobilePhone);
    }
}
