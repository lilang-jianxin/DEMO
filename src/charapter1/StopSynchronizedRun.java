package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class StopSynchronizedRun {
    public static void main(String[] args) {
        try {
            StopSynchronizedObject object = new StopSynchronizedObject();
            StopSynchronizedThread thread = new StopSynchronizedThread(object);
            thread.start();
            Thread.sleep(500);
            System.out.println(object.getUsername());
            System.out.println(object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
