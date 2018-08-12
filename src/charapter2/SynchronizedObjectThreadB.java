package charapter2;

/**
 * Created by Lee on 2018/7/30.
 */
public class SynchronizedObjectThreadB extends Thread{
    private SynchronizedObject object;

    public SynchronizedObjectThreadB(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.methodA();
    }
}
