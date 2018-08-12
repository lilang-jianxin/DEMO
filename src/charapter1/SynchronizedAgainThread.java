package charapter1;/**
 * Created by Lee on 2018/7/30.
 */

/**
 * @Author lee
 * @Date 2018-07-30 21:05
 */
public class SynchronizedAgainThread extends Thread {
    @Override
    public void run() {
        SynchronizedAgain again = new SynchronizedAgain();
        again.service();
    }

    public static void main(String[] args) {
        SynchronizedAgainThread thread = new SynchronizedAgainThread();
        thread.start();
    }
}
