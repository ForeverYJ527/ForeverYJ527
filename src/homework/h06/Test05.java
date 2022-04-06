package homework.h06;

public class Test05 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                Foo.dosome();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                Foo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Foo {
    public static void dosome() {
        synchronized (Foo.class) {
            System.out.println("hello!");
        }
    }
}