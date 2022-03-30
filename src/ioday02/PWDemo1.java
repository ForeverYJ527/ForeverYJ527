package ioday02;

/*
*缓冲字符流
* java.io.BufferedWriter和BufferedReader
* 缓冲字符流是一对高级的字符流，作用是块写文本数据加速的
*
* java.io.PrintWriter具有自动行刷新的缓冲字符输出流，
* 内部总是连接BufferedWriter，更常用
*
* */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class PWDemo1 {
    public static void main(String[] args) throws IOException {
        //向文件pw.txt中写入文本数据
        PrintWriter pw=new PrintWriter("pw.txt","UTF-8");
        pw.println("让我掉下眼泪的，不是昨夜的酒。");
        pw.println("让我依依不舍的，不是你的温柔。");
        System.out.println("写出完毕！");
        pw.close();

    }
}
