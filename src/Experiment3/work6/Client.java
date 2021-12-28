package Experiment3.work6;

import Experiment3.work6.com.orders.Command;
import Experiment3.work6.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:06
 **/
public class Client {
    public static void main(String[] args) {

        Command command;
        command = (Command) XMLUtil.getBean();

        command.open();
        command.close();
    }
}
