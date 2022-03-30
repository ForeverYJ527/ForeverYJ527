package lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {
    //匿名内部类
    FileFilter filter1 = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.getName().contains("D");
        }
    };

    //lambda表达式写法（就是省去了接口名和方法名）
    FileFilter filter2 = (File pathname) -> {
        return pathname.getName().contains("D");
    };

    //参数的类型可以忽略不写
    FileFilter filter3 = (pathname) -> {
        return pathname.getName().contains("D");
    };

    //如果只有一个参数，括号可以不写
    FileFilter filter4 = pathname -> {
        return pathname.getName().contains("D");
    };

    //如果方法里只有一句话，大括号可以不写，并且如果有return时要一同忽略
    FileFilter filter5 = pathname -> pathname.getName().contains("D");

}
