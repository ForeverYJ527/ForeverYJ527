package homework.h06;

public class Test02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->
                System.out.println("你是谁?")
        );

        Thread t2 = new Thread(() ->
                System.out.println("我是查水表的!")
        );

        t1.start();
        t2.start();
    }
}