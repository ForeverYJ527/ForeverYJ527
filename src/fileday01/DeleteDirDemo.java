package fileday01;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir=new File("./demo");
        if(dir.exists()){
            dir.delete();
            //删除目录时只有空目录可以被删除
            System.out.println("该目录已删除");
        }
        else
            System.out.println("该目录不存在");
    }
}
