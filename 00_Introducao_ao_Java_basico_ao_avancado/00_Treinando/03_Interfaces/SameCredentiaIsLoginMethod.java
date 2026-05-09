public class SameCredentiaIsLoginMethod implements LoginMethod {

    @Override
    public boolean login(String username, String password) {
        return username.equals(password);
    }

}
