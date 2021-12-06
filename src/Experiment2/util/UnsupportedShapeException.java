package Experiment2.util;

/**
 * @ClassName： UnsupportedShapeException
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 19:04
 **/
public class UnsupportedShapeException extends BaseException{
    //无参构造方法
    public UnsupportedShapeException(){

        super();
    }

    //有参的构造方法
    public UnsupportedShapeException(String message){
        super(message);
        System.out.println("没有这个图形！！！不支持绘制");
    }

    // 用指定的详细信息和原因构造一个新的异常
    public UnsupportedShapeException(String message, Throwable cause){
        super(message,cause);
    }

    //用指定原因构造一个新的异常
    public UnsupportedShapeException(Throwable cause) {

        super(cause);
    }

}
