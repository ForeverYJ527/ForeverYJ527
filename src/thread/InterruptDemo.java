package thread;

/**
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中其interrupt()方法被掉用，那么这时会中断
 * 该睡眠阻塞，并且sleep方法会抛出中断异常
 */
public class InterruptDemo {
    public static void main(String[] args) {
        Thread lin = new Thread(){//匿名内部类
            public void run(){
                System.out.println("林:刚美完容，睡一会吧~");
                try {
                    Thread.sleep(50000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("林:干嘛呢！干嘛呢！干嘛呢！都破了相了!");
                }
                System.out.println("林:醒了");
            }
        };

        Thread huang = new Thread(){
            public void run(){
                System.out.println("黄:大锤80！小锤40！开始砸墙!");
                for(int i=0;i<5;i++){
                    System.out.println("黄:80！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("咣当");
                System.out.println("黄:大哥！搞定！");
                lin.interrupt();//中断lin线程(如果线程处于睡眠阻塞，则是中断该阻塞状态)
            }
        };

        lin.start();
        huang.start();
    }
}
