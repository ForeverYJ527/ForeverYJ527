package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();//获取主线程进行查看
        String name = main.getName();//获取线程名字
        System.out.println(name);

        long id = main.getId();//获取线程唯一标识
        System.out.println(id);

        //priority:优先级
        int priority = main.getPriority();//获取线程的优先级
        System.out.println(priority);

        //当前线程是否被中断
        boolean isInterrupted = main.isInterrupted();
        System.out.println(isInterrupted);

        //是否为守护线程
        boolean isDaemon = main.isDaemon();
        System.out.println(isDaemon);

        //是否活着
        boolean isAlive = main.isAlive();
        System.out.println(isAlive);
    }
}
