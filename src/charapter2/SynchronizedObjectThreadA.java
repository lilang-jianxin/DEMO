package charapter2;

/**
 * Created by Lee on 2018/7/30.
 */
public class SynchronizedObjectThreadA extends Thread{
    private SynchronizedObject object;

    public SynchronizedObjectThreadA(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.methodA();
    }
}
