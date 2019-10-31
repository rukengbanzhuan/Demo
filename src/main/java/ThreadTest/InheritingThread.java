package ThreadTest;

/**
 * Created by wdy on 2019/3/14.
 */
public class InheritingThread extends Thread {

     private InheritingThread(String threadName) {
        super(threadName);
    }

    public static void main(String[] args) {
        new InheritingThread("inheritingThread").start();
        System.out.println(Thread.currentThread().getName() + " is running");

    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
