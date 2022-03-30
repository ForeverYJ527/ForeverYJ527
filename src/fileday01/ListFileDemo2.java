package fileday01;

import java.io.File;
import java.io.FileFilter;

public class ListFileDemo2 {
    public static void main(String[] args) {
        File dir=new File(".");
        if(dir.isDirectory()){
            FileFilter filter=new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    System.out.println("正在调用"+pathname.getName());
                    return pathname.getName().contains("o");
                }
            };
            File[] subs=dir.listFiles(filter);
            System.out.println("共"+subs.length+"个子项");
            for(int i=0;i<subs.length;i++){
                File sub=subs[i];
                System.out.println(sub.getName());
            }
        }

    }
}

class MyFilter implements FileFilter{
    @Override
    public boolean accept(File file) {
        //过滤名字含”o“的
        String name=file.getName();
        //String regex=".*o.*";//正则表达式
        //boolean match=name.matches(regex);
        //if(name.indexOf("o")>=0);

        return name.contains("o");
    }
}
