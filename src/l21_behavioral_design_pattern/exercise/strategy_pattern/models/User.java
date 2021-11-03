package l21_behavioral_design_pattern.exercise.strategy_pattern.models;

public class User {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.setUserStorage(new XMLStorage());
        userController.store();
        userController.setUserStorage(new MySQLStorage());
        userController.store();
//        userController.store();
    }
}
