package charapter1;

/**
 * Created by Lee on 2018/7/25.
 */
public class IsAliveTread extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
