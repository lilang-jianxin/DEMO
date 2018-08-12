package charapter2;/**
 * Created by Lee on 2018/8/12.
 */

/**
 * @Author lee
 * @Date 2018-08-12 10:13
 */
public class Task2 {

    public void doLongTimeTask() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "i 是:" + i);
            }
            Thread.sleep(3000);
            synchronized (this) {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "synchronize i 是:" + i);
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
