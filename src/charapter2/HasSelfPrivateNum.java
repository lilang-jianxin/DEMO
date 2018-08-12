package charapter2;

/**
 * Created by Lee on 2018/7/30.
 */
public class HasSelfPrivateNum {
    private int num = 0;

    synchronized public void addI(String name) {
        try {

            if ("a".equals(name)) {
                num = 100;
                System.out.println("a set over !");
                Thread.sleep(3000);
            } else {
                num = 200;
                System.out.println("b set over !");

            }
            System.out.println(name + " num=" + num);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
