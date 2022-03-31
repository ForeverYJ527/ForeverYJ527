package exception;

/**
 * 自定义异常
 * 通常用于那些满足语法但是不满足业务场景时的错误。
 * 自定义异常要做如下操作:
 * 1:类名要做到见名知义
 * 2:要继承自Exception(直接或间接继承都可以)
 * 3:提供超类异常支持的所有构造器
 *
 * 年龄不合法异常
 *
 */
public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}







