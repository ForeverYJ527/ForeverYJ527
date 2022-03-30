package ioday02;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PWDemo2 {
    public static void main(String[] args) throws IOException {
        //创建文件流时可以使用追加模式
        FileOutputStream fos = new FileOutputStream("./pw2.txt", true);
        //创建转换流时指定字符集
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);

        Scanner input = new Scanner(System.in);

        while (true) {
            String line = input.nextLine();
            if ("exit".equalsIgnoreCase(line))
                break;
            pw.println(line);
        }
        System.out.println("完成");
        pw.close();
    }
}
