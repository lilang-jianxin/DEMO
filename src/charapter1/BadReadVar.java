package charapter1;/**
 * Created by Lee on 2018/7/30.
 */

/**
 * @Author lee
 * @Date 2018-07-30 20:38
 * @Description 脏读
 */
public class BadReadVar {
    private String userName = "A";
    private String passWord = "AA";

    synchronized public void setValue(String userName, String passWord) {
        try {
            this.userName = userName;
            Thread.sleep(5000);
            this.passWord = passWord;
            System.out.println("setValue method thread name="
                    + Thread.currentThread().getName() + "useName=" + this.userName
                    + "passWord=" + this.passWord);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void getValue() {
        System.out.println("getValue method thread name=" + Thread.currentThread().getName()
                + "userName=" + this.userName
                + "passWord=" + this.passWord);
    }
}
