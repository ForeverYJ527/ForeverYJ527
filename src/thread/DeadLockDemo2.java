package thread;

/**
 * 解决死锁:
 * 1:尽量避免在持有一个锁的同时去等待持有另一个锁(避免synchronized嵌套)
 * 2:当无法避免synchronized嵌套时，就必须保证多个线程锁对象的持有顺序必须一致。
 *   即:A线程在持有锁1的过程中去持有锁2时,B线程也要以这样的持有顺序进行。
 */
public class DeadLockDemo2 {
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
                    }
                    System.out.println("北方人吃完了饭，放下了筷子");
                    System.out.println("北方人去拿勺子...");
                    synchronized (spoon){
                        System.out.println("北方人拿起了勺子，开始喝汤...");
                        Thread.sleep(5000);
                    }
                    System.out.println("北方人喝完了汤,北方人放下了勺子");
                    System.out.println("吃饭完毕。");
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
                    }
                    System.out.println("南方人喝完了汤，放下勺子...");
                    System.out.println("南方人去拿筷子...");
                    synchronized (chopsticks){
                        System.out.println("南方人拿起了筷子，开始吃饭...");
                        Thread.sleep(5000);
                    }
                    System.out.println("南方人吃完了饭,南方人放下了筷子");
                    System.out.println("吃饭完毕。");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        np.start();
        sp.start();
    }
}
