package charapter1;

/**
 * Created by Lee on 2018/7/25.
 */
public class MyThread extends  Thread {
    public MyThread () {
        System.out.println("构造方法打印的是:" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法打印的是" + Thread.currentThread().getName());
    }
}
