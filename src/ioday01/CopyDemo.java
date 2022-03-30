package ioday01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("ppt.pptx");
        FileOutputStream fos = new FileOutputStream("ppt_cp.pptx");
        /*
            image.cp内容:
            01111110 11110000 00001111 10101010 00110011
            ^^^^^^^^

            int d = fis.read();
            d的2进制
            00000000 00000000 00000000 01111110

            fos.write(d);

            image_cp.jpg内容
            01111110
         */
        int d;
        long start = System.currentTimeMillis();
        while((d = fis.read())!=-1) {
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");
        fis.close();
        fos.close();
    }
}
