package charapter2;/**
 * Created by Lee on 2018/8/12.
 */

/**
 * @Author lee
 * @Date 2018-08-12 10:13
 */
public class SynchronizeIsTrueTask {

    public void doLongTimeTask() {
        System.out.println("begin task");
        String privateDate1 = "长时间处理任务后从远处返回的值是1 threadName = " + Thread.currentThread().getName();
        String privateDate2 = "长时间处理任务后从远处返回的值是2 threadName = " + Thread.currentThread().getName();
        synchronized (this) {
            System.out.println(privateDate1);
            System.out.println(privateDate2);
        }
        System.out.println("endTask");
    }

    public void doLongTimeTaskB() {
        System.out.println("begin task");
        String privateDate1 = "长时间处理任务后从远处返回的值是B1 threadName = " + Thread.currentThread().getName();
        String privateDate2 = "长时间处理任务后从远处返回的值是B2 threadName = " + Thread.currentThread().getName();
        synchronized (this) {
            System.out.println(privateDate1);
            System.out.println(privateDate2);
        }
        System.out.println("endTask");
    }

    synchronized public void doLongTimeTaskC() {
        System.out.println("begin task");
        String privateDate1 = "长时间处理任务后从远处返回的值是C1 threadName = " + Thread.currentThread().getName();
        String privateDate2 = "长时间处理任务后从远处返回的值是C2 threadName = " + Thread.currentThread().getName();
        System.out.println(privateDate1);
        System.out.println(privateDate2);
        System.out.println("endTask");
    }
}
