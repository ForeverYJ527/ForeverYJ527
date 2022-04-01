package thread;

/**
 * 守护线程
 * 守护线程是通过普通线程调用方法setDaemon(true)设置而来的。
 * 守护线程和普通线程的区别体现在一个结束时机上的不同:
 * 当进程结束时，进程会强制杀死所有正在运行的守护线程并最终停止。
 *
 * 进程的结束:
 * 当java进程中所有的普通线程都结束时，进程就会结束。
 *
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {

        Thread rose = new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("rose:let me go!");
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("rose:啊啊啊啊啊啊AAAAAAaaaa.....");
                System.out.println("噗通!");
            }
        };

        Thread jack = new Thread(){
            public void run(){
                while(true){
                    System.out.println("jack:you jump!i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        rose.start();
        //设置守护线程的工作必须在线程start之前进行!!!!
        jack.setDaemon(true);//将jack设置为守护线程
        jack.start();

        while(true);

    }
}






