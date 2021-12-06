package Experiment2.util;

/**
 * @ClassName： BaseException
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 19:05
 **/
public class BaseException extends RuntimeException{

    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

}
