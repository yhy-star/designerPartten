package Experiment3.work10;

import Experiment3.work10.com.tem.DataTemplate;
import Experiment3.work10.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 19:06
 **/
public class Client {
    public static void main(String[] args) {

        DataTemplate template = (DataTemplate) XMLUtil.getBean();

        template.readData();
        template.convertData();
        template.dataAlgorithm();
        template.displayData();

    }
}
