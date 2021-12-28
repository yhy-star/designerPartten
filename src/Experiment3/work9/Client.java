package Experiment3.work9;

import Experiment3.work9.com.filters.Filter;
import Experiment3.work9.com.filters.Picture;
import Experiment3.work9.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 18:46
 **/
public class Client {
    public static void main(String[] args) {

        Picture picture = new Picture();

        Filter filter = (Filter) XMLUtil.getBean();

        picture.setFilter(filter);
        picture.setName("赵肥肥美照！！！");

        picture.display();
    }
}
