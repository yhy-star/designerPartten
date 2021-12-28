package Experiment3.work4;

import Experiment3.work4.com.proxy.BusinessHandler;
import Experiment3.work4.com.proxy.BusinessService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Calendar;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 9:54
 **/
public class Client {
    public static void main(String[] args) {

        InvocationHandler invocationHandler = null;

        BusinessService service = new BusinessService();
        invocationHandler = new BusinessHandler(service);

        BusinessService proxy = (BusinessService) Proxy.newProxyInstance(BusinessService.class.getClassLoader(), new Class[]{BusinessService.class}, invocationHandler);

        proxy.method();
    }
}
