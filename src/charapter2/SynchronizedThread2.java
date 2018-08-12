package charapter2;/**
 * Created by Lee on 2018/8/12.
 */

/**
 * @Author lee
 * @Date 2018-08-12 10:21
 */
public class SynchronizedThread2 extends Thread {
    private Task2 task;

    public SynchronizedThread2(Task2 task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}
