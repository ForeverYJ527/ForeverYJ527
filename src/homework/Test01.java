package homework;

import java.io.File;
import java.io.FileFilter;

public class Test01 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()) {//判断是否为目录
            //匿名内部类
            File[] subs1 = dir.listFiles(new FileFilter() {//文件过滤器FileFilter
                @Override
                public boolean accept(File pathname) {//接受
                    return pathname.getName().contains("s");
                }
            });
            System.out.println("当前目录一共包含" + subs1.length + "个子项");
            for (int i = 0; i < subs1.length; i++) {
                System.out.println(subs1[i].getName());
            }
        }

        if (dir.isDirectory()) {
            //lambda
            File[] subs2 = new File(".").listFiles(
                    f -> f.getName().contains("s"));
            System.out.println("当前目录一共包含" + subs2.length + "个子项");
            for (int i = 0; i < subs2.length; i++) {
                System.out.println(subs2[i].getName());
            }
        }

    }
}
