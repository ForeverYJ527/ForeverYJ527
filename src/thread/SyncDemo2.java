package thread;

/**
 * 同步块
 * 同步块可以更准确的锁定需要同步执行的代码片段，有效的缩小排队范围可以在保证安全的前提下
 * 尽可能的提高并发效率。
 * 语法:
 * synchronized(同步监视器对象){
 *     需要多个线程同步执行的代码片段
 * }
 *
 * 同步执行:多个线程执行时有先后顺序
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }
}

class Shop{
    /*
        在方法上使用synchronized时，同步监视器对象就是当前方法的所属对象，即:this
     */
    public synchronized void buy(){
//    public void buy(){
        try {
            Thread t = Thread.currentThread();//获取运行buy方法的线程
            System.out.println(t.getName() + ":正在挑衣服...");
            Thread.sleep(5000);
            /*
                同步块使用时需要指定一个同步监视器对象，即:上锁的对象
                该对象从语法的角度来讲可以是任意引用类型的实例。但是必须同时满足多个
                需要同步(排队)执行该代码片段的线程看到的是同一个对象才可以!
             */
            synchronized (this) {
//            synchronized (new Object()) {//无效的！
                System.out.println(t.getName() + ":正在试衣服...");
                Thread.sleep(5000);
            }

            System.out.println(t.getName() + ":结账离开");
        }catch(InterruptedException e){
        }
    }
}
