package charapter2;

/**
 * Created by Lee on 2018/7/30.
 */
public class HasSelfPrivateNumThreadRun {
    public static void main(String[] args) {
        HasSelfPrivateNum numa = new HasSelfPrivateNum();
        HasSelfPrivateNum numb = new HasSelfPrivateNum();
        HasSelfPrivateNumThreadA threadA = new HasSelfPrivateNumThreadA(numa);
        HasSelfPrivateNumThreadB threadB = new HasSelfPrivateNumThreadB(numb);
        threadA.setPriority(5);
        threadB.setPriority(5);
        threadA.start();
        threadB.start();


    }
}
