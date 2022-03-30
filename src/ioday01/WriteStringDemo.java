package ioday01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        //向文件中写入文本数据
        /*
            文件输出流的两种创建方式
            FileOutputStream(String path)
            FileOutputStream(File file)
            以上两种为覆盖模式，创建文件流时如果指定的文件存在，该文件内容会被清除。

            FileOutputStream(String path,boolean append)
            FileOutputStream(File file,boolean append)
            如果第二个参数为true则是追加模式，如果指定的文件存在，原来的内容都会保留，新
            写入的内容会顺序的追加到文件中。
         */
//        FileOutputStream fos = new FileOutputStream("fos.txt");
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
//        String line = "super idol的笑容都没你的甜，八月正午的阳光都没你耀眼。";
        String line = "热爱105°的你，滴滴纯净的蒸馏水。";
        /*
            String提供了一个方法:getBytes()可以将该字符串按照指定的字符集转换为
            对应的一组字节。参数指定的就是字符集。用StandardCharsets.UTF_8。
         */
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        System.out.println("写出完毕!");

        fos.close();

    }
}
