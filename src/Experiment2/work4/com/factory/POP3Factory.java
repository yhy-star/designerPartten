package Experiment2.work4.com.factory;

import Experiment2.work4.com.impl.AbstractConnetion;
import Experiment2.work4.com.impl.POP3Connection;

/**
 * @ClassName： POP3Factory
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:20
 **/
public class POP3Factory extends AbstractFactory{

    @Override
    public AbstractConnetion createConnection() {
        System.out.println("开始创建POP3对象！");
        return new POP3Connection();
    }
}
