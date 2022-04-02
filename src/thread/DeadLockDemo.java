package thread;

/**
 * 死锁
 * 以两个线程为例:当两个线程各自持有一个锁的过程中等待对方先释放锁时就会形成一种僵持状态
 * 导致程序卡住且无法再继续后面的执行，这个现象称为死锁
 */
public class DeadLockDemo {
    //筷子
    private static Object chopsticks = new Object();
    //勺
    private static Object spoon = new Object();

    public static void main(String[] args) {
        //北方人
        Thread np = new Thread(){
            public void run(){
                try {
                    System.out.println("北方人:开始吃饭");
                    System.out.println("北方人去拿筷子...");
                    synchronized (chopsticks) {
                        System.out.println("北方人拿起了筷子，开始吃饭...");
                        Thread.sleep(5000);
                        System.out.println("北方人吃完了饭，去拿勺...");
                        synchronized (spoon){
                            System.out.println("北方人拿起了勺子，开始喝汤...");
                            Thread.sleep(5000);
                        }
                        System.out.println("北方人喝完了汤,北方人放下了勺子");
                    }
                    System.out.println("北方人放下了筷子，吃饭完毕。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        //南方人
        Thread sp = new Thread(){
            public void run(){
                try {
                    System.out.println("南方人:开始吃饭");
                    System.out.println("南方人去拿勺...");
                    synchronized (spoon) {
                        System.out.println("南方人拿起了勺，开始喝汤...");
                        Thread.sleep(5000);
                        System.out.println("南方人喝完了汤，去拿筷子...");
                        synchronized (chopsticks){
                            System.out.println("南方人拿起了筷子，开始吃饭...");
                            Thread.sleep(5000);
                        }
                        System.out.println("南方人吃完了饭,南方人放下了筷子");
                    }
                    System.out.println("南方人放下了勺子，吃饭完毕。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        np.start();
        sp.start();
    }
}








