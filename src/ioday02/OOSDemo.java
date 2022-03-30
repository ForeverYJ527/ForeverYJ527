package ioday02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name="苍老师";
        int age=18;
        String gender="女";
        String[] otherInfo={"一个演员","来自霓虹","台词较少","广大男同学的启蒙老师"};

        Person p=new Person(name,age,gender,otherInfo);
        FileOutputStream fos=new FileOutputStream("person.obj");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(p);
        System.out.println("写出完毕");

        oos.close();
    }
}
