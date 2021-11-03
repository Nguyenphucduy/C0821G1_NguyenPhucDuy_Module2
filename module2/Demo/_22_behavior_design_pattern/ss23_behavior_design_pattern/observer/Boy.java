package ss23_behavior_design_pattern.observer;

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
