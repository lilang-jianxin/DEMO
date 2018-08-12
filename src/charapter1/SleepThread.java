package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class SleepThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException ex) {
            System.out.println("沉睡中进入了异常处理");
            ex.printStackTrace();
        }
    }
}
