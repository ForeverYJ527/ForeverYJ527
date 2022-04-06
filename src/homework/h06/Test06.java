package homework.h06;

import java.util.Arrays;

public class Test06 {
    public static int[] array = {};

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (array) {
                    for (int i = 0; i < 100; i++) {
                        array = Arrays.copyOf(array, array.length + 1);
                        array[array.length - 1] = i;
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (array) {
                    for (int i = 100; i < 200; i++) {
                        array = Arrays.copyOf(array, array.length + 1);
                        array[array.length - 1] = i;
                    }
                }
            }
        };
        t1.start();
        t2.start();

        Thread.sleep(1000);
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));
    }

}

