package thread;

public class SyncDemo3 {
    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                Boo.dosome();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo {
    //public synchronized static void dosome(){
    public static void dosome() {
        synchronized (Boo.class) {
            try {
                Thread t = Thread.currentThread();//获取主线程进行查看
                System.out.println(t.getName() + ":正在执行dosome方法...");
                Thread.sleep(5000);
                System.out.println(t.getName() + ":执行dosome方法完毕!");
            } catch (InterruptedException e) {

            }
        }
    }
}
