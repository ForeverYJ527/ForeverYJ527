package thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //1创建线程任务
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
        //创建两条线程分别执行任务
        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);
        //3启动线程
        t1.start();
        t2.start();
    }
}

class MyRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁啊");
        }
    }
}

class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("FBI,open the door!");
        }
    }
}
