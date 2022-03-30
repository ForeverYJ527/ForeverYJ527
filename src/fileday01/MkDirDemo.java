package fileday01;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
        File dir=new File("./a/b/c/d/demo");
        if(dir.exists())
            System.out.println("该目录已存在");
        else
            dir.mkdir();//创建目录时要求所在父目录必须存在
            dir.mkdirs();//会将不存在的父目录全部创建出来
            System.out.println("该目录已创建");
    }
}
