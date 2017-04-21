import java.util.concurrent.*;

/**
 * Created by lijianguo on 2017/4/19.
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();// 0, int_max
//        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5); // 5 5
//        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newSingleThreadExecutor();  // 1 1
        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            FutureTask<Integer> future = new FutureTask<Integer>(myThread);
            executor.submit(future);
            try {
                System.out.println("随机结果为：" + future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println("线程池大小：" + executor.getPoolSize() + "主线程数：" + executor.getCorePoolSize() + ",最大线程数" + executor.getMaximumPoolSize() + ",缓存队列数：" + executor.getQueue().size());

        }
        executor.shutdown();
    }


}
