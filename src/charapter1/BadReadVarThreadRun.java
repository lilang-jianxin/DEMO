package charapter1;/**
 * Created by Lee on 2018/7/30.
 */

/**
 * @Author lee
 * @Date 2018-07-30 20:54
 */
public class BadReadVarThreadRun {
    public static void main(String[] args) throws InterruptedException {
        BadReadVar var = new BadReadVar();
        BadReadVarThread thread = new BadReadVarThread(var);
        thread.start();
        Thread.sleep(2000);
        var.getValue();
    }
}
