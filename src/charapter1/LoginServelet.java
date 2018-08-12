package charapter1;

/**
 * Created by Lee on 2018/7/25.
 */
public class LoginServelet {
    private static String usernameRef;
    private static String passwordRef;
     public static void doPost(String username,String password) {
        try {
            usernameRef = username;

            passwordRef = password;
            System.out.println("username=" + usernameRef + "password=" + passwordRef);
        } catch (Exception ex) {
            // TODO: 2018/7/25 对异常进行捕获处理
            ex.printStackTrace();
        }
    }
}
