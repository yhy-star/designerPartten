package Experiment2.work4.com.factory;

import Experiment2.work4.com.impl.AbstractConnetion;
import Experiment2.work4.com.impl.HTTPConnection;

/**
 * @ClassName： HTTPFactory
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:23
 **/
public class HTTPFactory extends AbstractFactory{

    @Override
    public AbstractConnetion createConnection() {
        System.out.println("开始创建HTTP对象！");
        return new HTTPConnection();
    }
}
