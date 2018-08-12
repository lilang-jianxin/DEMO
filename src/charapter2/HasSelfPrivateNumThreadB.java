package charapter2;

/**
 * Created by Lee on 2018/7/30.
 */
public class HasSelfPrivateNumThreadB extends Thread {
    private HasSelfPrivateNum numRef;
    public HasSelfPrivateNumThreadB(HasSelfPrivateNum numRef) {
        this.numRef=numRef;
    }
    @Override
    public void run() {
       numRef.addI("b");
    }

}
