package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class StopThread extends Thread {
    private int i = 0;
    @Override
    public  void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            // TODO: 2018/7/28 还要进行中断处理
            ex.printStackTrace();
        } catch (ThreadDeath ex) {
            ex.printStackTrace();
        }
    }
}
