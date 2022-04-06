package homework.h06;

public class Test04 {
    public static void main(String[] args) {
        Boo b = new Boo();
        Thread t1 = new Thread() {
            public void run() {
                b.dosome();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                b.dosome();
            }
        };
        t1.start();
        t2.start();
    }

}

class Boo {
    public void dosome() {
        Thread t = Thread.currentThread();
        synchronized (this) {
            try {
                System.out.println(t.getName() + ":正在执行dosome方法...");
                Thread.sleep(5000);
                System.out.println(t.getName() + ":执行dosome方法完毕!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}