package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0||age>100){
//            throw new RuntimeException("年龄不合法");
            /*
                当我们使用throw主动对外抛出一个异常时，除了RuntimeException之外
                其他异常抛出时必须在方法上使用throws声明该异常的抛出
             */
//            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}
