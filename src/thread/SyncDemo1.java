package thread;

/**
 * 当多个线程并发操作同一临界资源，由于线程切换时机不确定，导致操作顺序出现了混乱，产生
 * 不正常后果。
 * 临界资源:操作该资源的完整过程同一时刻只能有单个线程进行的
 */
public class SyncDemo1 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    int bean = table.getBean();//从桌子上取一个豆子
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    int bean = table.getBean();//从桌子上取一个豆子
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class Table{
    private int beans = 20;//桌子上有20个豆子

    public int getBean(){
        if(beans==0){
            throw new RuntimeException("没有豆子了!");
        }
        //Thread.yield();//让线程主动放弃本次时间片，用来模拟执行到这里时CPU没有时间了
        return beans--;
    }
}









