package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之后，java推出了一个自动关闭特性。
 * 可以在异常处理机制中用更精简的写法完成IO的关闭操作
 */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        try(
                /*
                    只有实现了java.io.AutoCloseable接口的类才可以在这里定义并初始化
                    编译器在编译代码的时候最终会将在这里定义的类在finally中调用close()关闭
                    注:最终编译完的样子可以参考FinallyDemo2.java的样子。
                 */
                FileOutputStream fos = new FileOutputStream("fos.dat");
        ){
            fos.write(1);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}




