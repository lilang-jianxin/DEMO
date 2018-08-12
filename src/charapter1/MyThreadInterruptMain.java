package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class MyThreadInterruptMain {
    public static void main(String[] args) {
        try {
            MyThreadInterrupt threadInterrupt = new MyThreadInterrupt();
            threadInterrupt.start();
            Thread.sleep(2*1000);
            threadInterrupt.interrupt();
            System.out.println(" 是否停止线程1? ="+threadInterrupt.isInterrupted());
        } catch (InterruptedException ex) {
            System.out.println("main catch");
            ex.printStackTrace();
        }
        System.out.println("end!");
    }
}
