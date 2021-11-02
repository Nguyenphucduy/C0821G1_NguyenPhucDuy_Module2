package l20_structural_design_pattern.practice.facade.models;

import l20_structural_design_pattern.practice.facade.service.SocialShare;

public class LinkedIn implements SocialShare {
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to LinkedIn: " + this.message);
    }
}
