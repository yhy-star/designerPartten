package Experiment2.work10;

import Experiment2.work10.com.targets.DataRestore;
import Experiment2.work10.com.util.XMLUtil;


/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 16:07
 **/
public class Client {
    public static void main(String[] args) {
        DataRestore dataRestore;
        dataRestore = (DataRestore) XMLUtil.getBean();
        dataRestore.restoreData("法外狂徒张三！！！");
    }
}
