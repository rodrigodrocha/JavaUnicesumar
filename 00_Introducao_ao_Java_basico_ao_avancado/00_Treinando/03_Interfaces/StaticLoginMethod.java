public class StaticLoginMethod implements LoginMethod {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123";

    @Override
    public boolean login(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }

}
