package fileday01;

import java.io.File;

public class ListFileDemo {
    public static void main(String[] args) {
        File dir=new File(".");//当前目录
        // boolean isFile判断当前File是否是文件

        if(dir.isDirectory()){//判断当前file是否是一个目录
            File[] sub=dir.listFiles();
            //返回当前目录中所有子项，每个子项都包含在返回的数组中作为一个元素
            System.out.println("当前目录中一共包含"+sub.length+"个子项");
            for (int i=0;i<sub.length;i++){
                System.out.println(sub[i].getName());
            }

        }
    }
}
