package ioday02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/*
* 字符流
* java将流按照读写的数据单位划分为字节流和字符流
* java.io.InputStream和OutputStream是所有字节输入和输出流的超类
* java.io.Reader和Writer则是所有字符输入和输出流的超类
* 注：这两对超类之间是平级的，互相没有继承关系
*
* Reader里定义了读取字符的相关方法
* Writer里定义了写出字符的相关方法
* 特点都是亿char为单位
*
* 转换流：
* java.io.InputStreamReader和OutputStreamWriter
* 它们是常见的字符流实现类，同时是一对高级流。实际开发中我们不会直接使用它们，但是在流连接
* 中它们是重要的
*
* */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //向文件osw.txt中写入文本文件
        FileOutputStream fos=new FileOutputStream("osw.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);

        String line="摩擦摩擦，在光滑的地板上摩擦";

//        byte[] data=line.getBytes(StandardCharsets.UTF_8);
//        fos.write(data);

        osw.write(line);

        System.out.println("写出完毕");
        osw.close();
    }
}
