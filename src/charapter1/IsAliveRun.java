package charapter1;

/**
 * Created by Lee on 2018/7/25.
 */
public class IsAliveRun {
    public static void main(String[] args) throws InterruptedException {
        IsAliveTread isAliveTread = new IsAliveTread();
        System.out.println("begin ==" + isAliveTread.isAlive());
        isAliveTread.start();
        Thread.sleep(1000);
        System.out.println("end ==" + isAliveTread.isAlive());

    }
}
