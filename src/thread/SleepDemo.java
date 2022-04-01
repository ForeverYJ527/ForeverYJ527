package thread;

import java.util.Scanner;

/**
 * sleep阻塞
 * 线程提供了一个静态方法sleep，可以使运行该方法的线程阻塞指定毫秒。超时后线程会自动回到
 * RUNNABLE状态继续并发运行
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        /*
            倒计时程序
            输入一个数字，然后从该数字开始每秒递减，到0时输出时间到
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        for(int num = scanner.nextInt();num>0;num--) {
            System.out.println(num);
            try {
                Thread.sleep(1000);//毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("时间到！程序结束了...");
    }
}



