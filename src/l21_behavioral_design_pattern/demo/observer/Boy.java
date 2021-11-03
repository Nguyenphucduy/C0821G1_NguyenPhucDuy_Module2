package l21_behavioral_design_pattern.demo.observer;

public class Boy implements Observer {
    private String name;
    public Boy(String name) {
        this.name = name;
    }
    @Override
    public void care(){
        System.out.println(this.name + "Are you OK");
    }
}
