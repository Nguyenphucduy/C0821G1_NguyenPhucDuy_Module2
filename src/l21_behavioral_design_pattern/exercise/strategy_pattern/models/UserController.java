package l21_behavioral_design_pattern.exercise.strategy_pattern.models;

import l21_behavioral_design_pattern.exercise.strategy_pattern.services.UserStorage;

public class UserController implements UserStorage {
    private UserStorage userStorage;

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
