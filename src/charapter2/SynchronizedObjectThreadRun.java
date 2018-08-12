package charapter2;/**
 * Created by Lee on 2018/7/30.
 */

/**
 * @author lee
 * @date 2018-07-30 20:04
 */
public class SynchronizedObjectThreadRun {
    public static void main(String[] args) {
        SynchronizedObject object = new SynchronizedObject();
        SynchronizedObjectThreadA threadA = new SynchronizedObjectThreadA(object);
        SynchronizedObjectThreadB threadB = new SynchronizedObjectThreadB(object);
        threadA.setName("A");
        threadA.start();
        threadB.setName("B");
        threadB.start();
    }
}
