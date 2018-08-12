package charapter1;/**
 * Created by Lee on 2018/7/30.
 */

/**
 * @Author lee
 * @Date 2018-07-30 20:52
 * @Description 脏读
 */
public class BadReadVarThread extends Thread{
    private BadReadVar var ;

    public BadReadVarThread(BadReadVar var) {
        this.var = var;
    }

    @Override
    public void run() {
        var.setValue("B","BB");
    }
}
