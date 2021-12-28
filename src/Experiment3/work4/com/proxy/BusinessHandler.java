package Experiment3.work4.com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName： BusinessHandler
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 12:14
 **/
public class BusinessHandler implements InvocationHandler {

    private Calendar calendar;
    private Object object;

    public BusinessHandler() {
    }

    public BusinessHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        try {
            Object result = method.invoke(object, args);
            afterInvokeSuccess();
        } catch (Exception e){
            afterInvokeFail();
        }
        return null;
    }

    public void beforeInvoke(){
        calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + ":" + minute + ":" + second;
        System.out.println("调用时间：" + time);
    }

    public void afterInvokeSuccess(){
        System.out.println("------ 方法method()调用成功 ------");
    }

    public void afterInvokeFail(){
        System.out.println("------ 方法method()调用失败 ------");
    }
}
