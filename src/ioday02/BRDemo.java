package ioday02;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./note.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);

        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}
