package fileday01;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File file=new File("test.txt");// ./可以省略
        if(file.exists()) {
            file.delete();
            System.out.println("文件已删除");
        }
        else
            System.out.println("文件不存在");
    }
}
