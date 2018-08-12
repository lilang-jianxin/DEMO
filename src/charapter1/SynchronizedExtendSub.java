package charapter1;/**
 * Created by Lee on 2018/7/30.
 */

/**
 * @Author lee
 * @Date 2018-07-30 21:08
 */
public class SynchronizedExtendSub extends SynchronizedExtend{

    synchronized public void operateSubMethod() {
        try {
            while (i > 0) {
                System.out.println("sub print i=" + i);
                Thread.sleep(1000);
                this.operateMainMethod();
                i--;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }


}
