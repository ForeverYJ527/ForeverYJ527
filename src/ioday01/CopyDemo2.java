package ioday01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过提高每次读写的数据量，减少实际读写的次数，可以提高读写效率。
 *
 * 单字节的读写属于随机读写形式。
 * 一组字节的读写属于块读写形式。
 * 大多数的硬件快读写都比随机读写性能好，尤其机械硬盘上体现最为明显。
 *
 * InputStream和OutputStream上定义了块读写数据的相关方法。
 *
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("ppt.pptx");
        FileOutputStream fos = new FileOutputStream("ppt_cp.pptx");
        /*
            InputStream中提供了块读操作
            int read(byte[] data)
            一次性读取给定字节数组总长度的字节量，并存入到数组当中，返回值为实际读取到
            的字节量。如果返回值为-1则表示读取到了末尾。

            假设:
            ppt.pptx内容:
            00001111 11110000 10101010 01010101 11001100 00110011

            byte[] data = new byte[4];//创建一个长度为4的字节数组
            data:[00000000,00000000,00000000,00000000]
            int len;//记录每次读取到的字节数

            第一次调用:
            len = fis.read(data);
            从ppt.pptx文件中一次读取4个字节
            ppt.pptx内容:
            00001111 11110000 10101010 01010101 11001100 00110011
            ^^^^^^^^ ^^^^^^^^ ^^^^^^^^ ^^^^^^^^

            data:{00001111,11110000,10101010,01010101}数组存入的是本次读取的数据
            len:4 表示本次实际读取到了4个字节

            第二次调用:
            len = fis.read(data);
            从ppt.pptx文件中一次读取4个字节
            ppt.pptx内容:
            00001111 11110000 10101010 01010101 11001100 00110011 文件末尾了
                                                ^^^^^^^^ ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                实际只读取到了2个字节
            data:{11001100,00110011,10101010,01010101}数组存入的是本次读取的数据
                  |---本次新读取的--| |---上次的旧数据---|
            len:2 表示本次实际读取到了2个字节


            第三次调用:
            len = fis.read(data);
            从ppt.pptx文件中一次读取4个字节
            ppt.pptx内容:
            00001111 11110000 10101010 01010101 11001100 00110011 文件末尾了
                                                                  ^^^^^^^^ ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                  没有数据可以读取了
            data:{11001100,00110011,10101010,01010101}数组没有变化
                  |----------上次的旧数据--------------|
            len:-1 表示流读取到了末尾
         */
        /*
            8位2进制 00000000 1byte  1字节
            1024byte   1kb
            1024kb     1mb  1兆
            1024mb     1gb
            1024gb     1tb
         */
        byte[] data = new byte[1024*10];//10kb
        int len;//每次实际读取到的字节数

        long start = System.currentTimeMillis();
        while((len = fis.read(data)) != -1){
            /*
                OutputStream的块写方法:
                void write(byte[] data)
                将给定的字节数组中所有内容全部写出

                void write(byte[] data,int off,int len)
                将给定字节数组从下标off处开始的连续len个字节一次性写出
             */
//            fos.write(data);
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");
        fis.close();
        fos.close();
    }
}






