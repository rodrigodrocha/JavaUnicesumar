public class ExLogin {

        public static void main(String[] args) {
            StaticLoginMethod l1 = new StaticLoginMethod();
            System.out.println(l1.login("admin", "123"));
            System.out.println(l1.login("user", "234"));
            
            SameCredentiaIsLoginMethod l2 = new SameCredentiaIsLoginMethod();
            
            System.out.println(l2.login("user", "user"));
            System.out.println(l2.login("user", "234"));
        }
}
