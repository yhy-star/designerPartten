package Experiment3.work3;

import Experiment3.work3.com.facades.AbstractFacade;
import Experiment3.work3.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 9:06
 **/
public class Client {
    public static void main(String[] args) {
        AbstractFacade facade;
        facade = (AbstractFacade) XMLUtil.getBean();
        facade.copy();
    }
}
