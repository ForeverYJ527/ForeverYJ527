package homework;

import java.io.File;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()) {
            System.out.println("输入关键字：");
            String key = new Scanner(System.in).nextLine();

            //lambda
            File[] subs = new File(".").listFiles(
                    f -> f.getName().contains(key));
            System.out.println("当前目录一共包含" + subs.length + "个子项");
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i].getName());
            }
        }
    }
}
