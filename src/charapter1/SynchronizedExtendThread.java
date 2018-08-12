package charapter1;/**
 * Created by Lee on 2018/7/30.
 */

/**
 * @Author lee
 * @Date 2018-07-30 21:14
 */
public class SynchronizedExtendThread extends Thread{
    @Override
    public void run() {
        SynchronizedExtendSub sub = new SynchronizedExtendSub();
        sub.operateSubMethod();
    }

    public static void main(String[] args) {
        SynchronizedExtendThread thread = new SynchronizedExtendThread();
        thread.start();
    }
}
