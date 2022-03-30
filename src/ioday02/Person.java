package ioday02;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {//序列化接口
    public static final long serialVersionUID = 1L;
    //实现序列化接口后最好主动定义序列化版本号这个常量
    //这样在对象序列化后就不会根据类的机构生成一个版本号，而是固定值
    //这样在反序列化时，还原的对象和当前类版本号一致才能还原

    private String name;
    private int age;
    private String gender;
    private transient String[] otherInfo;
    //transient修饰的属性在对象序列化时会被忽略，以达到对象瘦身，减少资源开销

    public Person() {
    }

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }

}
