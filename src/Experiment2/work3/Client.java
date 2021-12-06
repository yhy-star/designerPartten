package Experiment2.work3;

import Experiment2.work3.shape.Circle;
import Experiment2.work3.shape.Shape;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 19:10
 **/
public class Client {

    public static void main(String[] args) {

        String name = "circle";

        SimpleFactory simpleFactory = new SimpleFactory();

        Shape shape = simpleFactory.createShape(name);

        shape.draw();
        shape.erase();
    }
}
