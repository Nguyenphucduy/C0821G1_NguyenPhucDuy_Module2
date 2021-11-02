package l21_behavioral_design_pattern.exercise.strategy_pattern.models;

import l21_behavioral_design_pattern.exercise.strategy_pattern.services.UserStorage;

public class XMLStorage implements UserStorage {
    @Override
    public void store() {
        System.out.println(" Save file XML ");
    }
}
