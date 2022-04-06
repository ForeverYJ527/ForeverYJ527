package homework.h01;

import java.io.*;

public class Test02 {
    public static void main(String[] args) throws IOException {
        File dir = new File("./src/homework");
        if (dir.isDirectory()) {
            File[] subs = dir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return pathname.isFile();
                }
            });
            for (int i = 0; i < subs.length; i++) {
                //原文件名字
                String name1 = subs[i].getName().substring(
                        0, subs[i].getName().lastIndexOf("."));

                //原文件后缀
                String name2 = subs[i].getName().substring(
                        subs[i].getName().lastIndexOf(".") + 1);

                String copy = name1 + "_cp." + name2;//拼接

                FileOutputStream fos = new FileOutputStream(copy);
                FileInputStream fis = new FileInputStream(subs[i]);

                byte[] data = new byte[1024 * 10];
                int len;
                while ((len = fis.read(data)) != -1) {//len是读取的字节数，为-1时读到文件末尾
                    fos.write(data, 0, len);//写入文件从data下标0--len
                }
            }
            System.out.println("复制完成");
        }
    }

}
