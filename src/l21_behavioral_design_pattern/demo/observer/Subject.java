package l21_behavioral_design_pattern.demo.observer;

public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void note();
}
