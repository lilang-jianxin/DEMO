package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class SuspendThreadRun {
    public static void main(String[] args) {
        try {
            SuspendThread thread = new SuspendThread();
            thread.start();
            Thread.sleep(5000);
            //第一段
            thread.suspend();
            System.out.println("I="+thread.getI());
            Thread.sleep(5000);
            System.out.println("I="+thread.getI());
            //第二段
            thread.resume();
            Thread.sleep(1000);
            //第三段
            thread.suspend();
            System.out.println("I="+thread.getI());
            Thread.sleep(5000);
            System.out.println("I="+thread.getI());
            thread.stop();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
