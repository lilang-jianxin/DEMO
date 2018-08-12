package charapter2;/**
 * Created by Lee on 2018/8/12.
 */

/**
 * @Author lee
 * @Date 2018-08-12 10:13
 */
public class Task {
    private String getData1;
    private String getData2;

    public void doLongTimeTask() {
        try {
            System.out.println("begin task");
            String privateDate1="长时间处理任务后从远处返回的值是1 threadName = " + Thread.currentThread().getName();
            String privateDate2="长时间处理任务后从远处返回的值是2 threadName = " + Thread.currentThread().getName();
            Thread.sleep(3000);
            synchronized (this) {
                getData1=privateDate1;
                getData2=privateDate2;
            }
            //非常可能发生数据脏读
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("endTask");
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
