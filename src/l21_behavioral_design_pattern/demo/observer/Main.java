package l21_behavioral_design_pattern.demo.observer;

public class Main {
    public static void main(String[] args) {
        HotGirt hotGirt = new HotGirt();
        hotGirt.add(new Boy("boy1"));
        hotGirt.add(new Boy("boy2"));
        hotGirt.add(new Boy("boy3"));
        hotGirt.postFaceBook();
    }
}
