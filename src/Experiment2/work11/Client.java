package Experiment2.work11;

import Experiment2.work11.com.components.Shape;
import Experiment2.work11.com.impl.Impl;
import Experiment2.work11.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 16:49
 **/
public class Client {
    public static void main(String[] args) {

        Shape shape;
        Impl impl;

        shape = (Shape) XMLUtil.getBean("shape");
        impl = (Impl) XMLUtil.getBean("method");

        shape.setImpl(impl);
        shape.createShape();
    }
}
