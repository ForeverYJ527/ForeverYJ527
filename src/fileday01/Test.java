package fileday01;

import java.io.File;
import java.io.FileFilter;

//获取./scr/file目录下所有名字以"D"开头的子项

public class Test {
    public static void main(String[] args) {
        File file=new File("./src/file");
        if(file.isDirectory()){
            //过滤器
            FileFilter filter=new FileFilter(){//匿名内部类
                @Override
                public boolean accept(File pathname) {
                    return pathname.getName().contains("D");
                }
            };
            File[] subs=file.listFiles(filter);
            System.out.println(subs.length);
            for(int i=0;i< subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}
