package homework.h06;

import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                while (true) {
                    Date now = new Date();
                    System.out.println(now);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        t.start();
    }

}
