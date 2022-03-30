package fileday01;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file=new File("./demo.txt");
        //获取File表示的文件或目录的名字
        String name=file.getName();
        System.out.println(name);
        //获取大小，就是文件在硬盘上实际占用的空间（单位是字节）
        long length=file.length();
        System.out.println("大小"+length+"字节");

        boolean cw=file.canWrite();
        System.out.println("可写："+cw);
        boolean cr=file.canRead();
        System.out.println("可读："+cr);
        boolean ih=file.isHidden();
        System.out.println("是否隐藏："+ih);


    }
}
