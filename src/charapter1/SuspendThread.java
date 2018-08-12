package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class SuspendThread extends  Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            i++;
        }
    }
}
