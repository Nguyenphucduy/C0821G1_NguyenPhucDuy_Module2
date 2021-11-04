package l21_behavioral_design_pattern.demo.observer;

public class Main {
    public static void main(String[] args) {
        HotGirl hotGirl = new HotGirl();
        hotGirl.add(new Boy("boy1"));
        hotGirl.add(new Boy("boy2"));
        hotGirl.add(new Boy("boy3"));
        hotGirl.postFaceBook();
    }
}
