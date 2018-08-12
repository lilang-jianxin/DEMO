package charapter2;

/**
 * Created by Lee on 2018/7/30.
 */
public class SynchronizedObject {
    public void methodA() {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            int i = 0;
            if (Thread.currentThread().getName()=="A"){
                Thread.sleep(1000);
                for (;i < 10;i++){}
            }
            if (Thread.currentThread().getName()=="B"){
                i = 100;
            }
            System.out.println("end i=" + i);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
