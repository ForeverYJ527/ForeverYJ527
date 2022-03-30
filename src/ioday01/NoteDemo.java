package ioday01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *  完成一个简易记事本工具
 *  要求:程序启动后，将用户在控制台上输入的每一行字符串都写入文件note.txt中。
 *  当用户单独输入exit时程序退出。
 */
public class NoteDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("note.txt");
        while(true){
            //先获取控制台输入的一行字符串
            String line = scanner.nextLine();
            //判断用户输入的是否为exit
            if("exit".equals(line)){//exit在前防止当line在前时出现空指针
                break;
            }
            //写入文件
            //1先将字符串转换为一组字节
            byte[] data = line.getBytes(StandardCharsets.UTF_8);
            //2将这组字节写入文件
            fos.write(data);
        }

        System.out.println("再见!");
        fos.close();
    }
}
