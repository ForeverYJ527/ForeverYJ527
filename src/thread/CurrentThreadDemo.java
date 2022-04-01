package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {

        Thread main = Thread.currentThread();
        System.out.println("主线程:" + main);
        dosome();

    }

    public static void dosome() {
        Thread t = Thread.currentThread();
        System.out.println("执行dosome方法的线程是:" + t);
    }
}
