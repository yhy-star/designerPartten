package Experiment2.work4;

import Experiment2.work4.com.factory.AbstractFactory;
import Experiment2.work4.com.impl.AbstractConnetion;
import Experiment2.work4.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:25
 **/
public class Client {
    public static void main(String[] args) {

        AbstractConnetion connetion;
        AbstractFactory factory;

        factory = (AbstractFactory) XMLUtil.getBean();
        connetion = factory.createConnection();
        connetion.getConnection();
    }
}
