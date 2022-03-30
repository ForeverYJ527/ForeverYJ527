package ioday03;

import java.io.IOException;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            String line = null;
            System.out.println(line.length());
        } catch (NullPointerException e) {
            System.out.println("出现了空指针异常");
        }

        System.out.println("end");
    }
}
