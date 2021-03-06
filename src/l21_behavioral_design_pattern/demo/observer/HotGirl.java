package l21_behavioral_design_pattern.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class HotGirl implements Subject{

  public List<Boy> friendZone = new ArrayList<>();
    public HotGirl() {

    }
    @Override
    public void add(Observer observer) {
        friendZone.add((Boy)observer);
    }

    @Override
    public void remove(Observer observer) {
        // code remove
    }

    @Override
    public void note(){
        for (Boy boy: friendZone){
            boy.care();
        }
    }
    public void postFaceBook(){
        System.out.println("post succesfully");
        note();
    }

}
