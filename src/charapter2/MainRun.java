package charapter2;/**
 * Created by Lee on 2018/8/12.
 */

/**
 * @Author lee
 * @Date 2018-08-12 10:27
 */
public class MainRun {
    public static void main(String[] args) {
        Task2 task = new Task2();
        SynchronizedThread thread = new SynchronizedThread(task);
        thread.setName("A");
        thread.start();
        SynchronizedThread2 thread2 = new SynchronizedThread2(task);
        thread2.setName("B");
        thread2.start();

    }
}
