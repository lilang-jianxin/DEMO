package charapter1;

/**
 * Created by Lee on 2018/7/28.
 */
public class MyThreadInterrupt extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000; i++) {
            if (this.isInterrupted()){
                System.out.println("已经是终止状态我需要退出！");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
