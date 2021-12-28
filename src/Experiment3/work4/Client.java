package Experiment3.work4;

import Experiment3.work4.com.proxy.AbstractService;
import Experiment3.work4.com.proxy.BusinessHandler;
import Experiment3.work4.com.proxy.BusinessService;
import Experiment3.work4.com.util.XMLUtil;

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

        AbstractService service = (AbstractService) XMLUtil.getBean();
        invocationHandler = new BusinessHandler(service);

        AbstractService proxy = (AbstractService) Proxy.newProxyInstance(AbstractService.class.getClassLoader(), new Class[]{AbstractService.class}, invocationHandler);

        proxy.method();
    }
}
