package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class StopRun {
    public static void main(String[] args) {
        try {
            StopThread thread = new StopThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
