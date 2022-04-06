package homework.h06;

public class Test01 {
    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();
        Thread t1 = new Thread(run);

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("好!");
                }
            }
        };

        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("你好!");
        }
    }
}