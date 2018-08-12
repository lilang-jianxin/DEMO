package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class StopSynchronizedThread extends Thread {
    private StopSynchronizedObject object;
    public  StopSynchronizedThread(StopSynchronizedObject object) {
        super();
        this.object=object;
    }
    @Override
    public void run() {
        object.printString("b","bb");
    }
}
