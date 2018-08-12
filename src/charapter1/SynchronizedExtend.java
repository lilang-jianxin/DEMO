package charapter1;/**
 * Created by Lee on 2018/7/30.
 */

/**
 * @Author lee
 * @Date 2018-07-30 21:08
 */
public class SynchronizedExtend {
    public int i = 10;
    synchronized public void operateMainMethod() {
        while (i>3) {
            i--;
            try {
                Thread.sleep(1000);
                System.out.println("operateMainMethod i =" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
