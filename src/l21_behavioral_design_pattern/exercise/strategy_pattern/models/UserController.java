package l21_behavioral_design_pattern.exercise.strategy_pattern.models;

import l21_behavioral_design_pattern.demo.strategy.SortStrategy;
import l21_behavioral_design_pattern.exercise.strategy_pattern.services.UserStorage;

import java.util.ArrayList;
import java.util.List;

public class UserController implements UserStorage {
    private UserStorage userStorage;
    private List<String> items = new ArrayList<>();

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public UserController() {
    }

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public void store() {
        userStorage.store();
    }
}
