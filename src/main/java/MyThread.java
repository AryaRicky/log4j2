import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class MyThread implements Callable<Integer> {

    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "is running.");
        return new SecureRandom().nextInt(100);
    }

    /*public void run() {
        System.out.println(Thread.currentThread().getName() + "is start.");
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "is end.");
    }*/
}