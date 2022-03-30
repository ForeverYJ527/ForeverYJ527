package ioday02;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BOS_FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("bos.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        String line="咋瓦鲁多";
        byte[] data=line.getBytes(StandardCharsets.UTF_8);
        bos.write(data);
        System.out.println("写出完毕");
        bos.flush();//冲
        bos.close();

    }
}
