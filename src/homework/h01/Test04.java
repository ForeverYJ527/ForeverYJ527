package homework.h01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("test.txt");
        FileOutputStream fos=new FileOutputStream("test_cp.txt");
        int data;
        while((data=fis.read())!=-1){
            fos.write(data);
        }
        System.out.println("完成");
        fis.close();
        fos.close();

    }
}
