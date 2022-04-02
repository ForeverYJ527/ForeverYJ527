package thread;

public class SyncDemo4 {
    public static void main(String[] args) {
        Foo f = new Foo();
        Thread t1 = new Thread() {
            public void run() {
                f.methodA();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                f.methodB();
            }
        };
        t1.start();
        t2.start();

        Foo f1 = new Foo();
        Foo f2 = new Foo();
//        Thread t3 = new Thread() {
//            public void run() {
//                f1.methodA();
//            }
//        };
//        Thread t4 = new Thread() {
//            public void run() {
//                f2.methodA();
//            }
//        };
//        t3.start();
//        t4.start();

    }
}

class Foo {
    //public synchronized void methodA(){
    public synchronized static void methodA() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行A方法");
            Thread.sleep(5000);
            System.out.println(t.getName() + ":执行A方法完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //public synchronized void methodB(){
    public void methodB() {
        //synchronized (this){
        synchronized (Foo.class) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":正在执行B方法");
                Thread.sleep(5000);
                System.out.println(t.getName() + ":执行B方法完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
