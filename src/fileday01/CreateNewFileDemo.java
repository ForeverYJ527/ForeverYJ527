package fileday01;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("./test.txt");//  ./表示这个项目当前目录
        if(file.exists())
            System.out.println("该文件已存在！");
        else
            file.createNewFile();

    }
}
