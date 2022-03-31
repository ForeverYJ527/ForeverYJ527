package exception;

/**
 * 异常处理机制中的finally块
 * finally块是异常处理机制的最后一块，它可以跟在try之后或者最后一个catch之后。
 * finally可以保证只要程序执行到try语句块中，无论try中是否出现异常，finally最终都
 * 会必定执行。
 * 通常我们将释放资源这类操作放在finally中确保运行，例如IO操作后最终的close()调用。
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String line = "abc";
            System.out.println(line.length());
            //try语句块中出错代码以下的内容均不执行!
            System.out.println("!!!!!");
            return;
        }catch(Exception e){
            System.out.println("出错了!");
        }finally {
            System.out.println("finally中的代码执行了!");
        }
        System.out.println("程序结束了");
    }
}
