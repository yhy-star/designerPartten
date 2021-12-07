package Experiment2.work4.com.factory;

import Experiment2.work4.com.impl.AbstractConnetion;
import Experiment2.work4.com.impl.IMAPConnection;

/**
 * @ClassName： IMAPFactory
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:23
 **/
public class IMAPFactory extends AbstractFactory{

    @Override
    public AbstractConnetion createConnection() {
        System.out.println("开始创建IMAP对象！");
        return new IMAPConnection();
    }
}
