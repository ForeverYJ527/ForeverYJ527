package ioday01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 使用文件输入流读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        //将fos.dat文件中的数据读取回来
        FileInputStream fis = new FileInputStream("./fos.dat");
        /*
                int read()
                读取一个字节，并以int型返回。返回的int值对应的2进制的低八位为读取到
                的字节数据。如果返回值为int的-1则表示读取到了流的末尾
                fos.dat
                00000001 00000010
                ^^^^^^^^
                int d = fis.read();
                d的2进制样子:
                00000000 00000000 00000000 00000001
                |--------补24个0----------| 读取的字节
         */
        int d = fis.read();//读取文件的第一个字节
        System.out.println(d);
        /*
                fos.dat
                00000001 00000010
                         ^^^^^^^^
                d = fis.read();
                d的2进制样子:
                00000000 00000000 00000000 00000010
                |--------补24个0----------| 读取的字节

         */
        d = fis.read();//读取文件的第二个字节
        System.out.println(d);
        /*
                fos.dat
                00000001 00000010 文件末尾了
                                  ^^^^^^^^
                d = fis.read();
                d的2进制样子:
                11111111 11111111 11111111 11111111
                特殊值表示文件末尾!

         */
        d = fis.read();//读取文件的第三个字节
        System.out.println(d);//-1
        fis.close();
    }
}
