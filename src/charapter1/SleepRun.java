package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class SleepRun {
    public static void main(String[] args) {
        try {
            SleepThread sleepThread = new SleepThread();
            sleepThread.start();
            //Thread.sleep(200);
            sleepThread.interrupt();
        } catch (Exception ex) {
            System.out.println("main catch");
            ex.printStackTrace();
        }
        System.out.println("end!");
    }
}
