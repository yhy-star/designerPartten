package Experiment2.work3;

import Experiment2.util.BaseException;
import Experiment2.util.UnsupportedShapeException;
import Experiment2.work3.shape.Circle;
import Experiment2.work3.shape.Rectangle;
import Experiment2.work3.shape.Shape;
import Experiment2.work3.shape.Triangle;

/**
 * @ClassName： SimpleFactory
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 18:39
 **/
public class SimpleFactory{

    public Shape createShape(String name) throws UnsupportedShapeException {
        if(name.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if(name.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        } else if(name.equalsIgnoreCase("Triangle")){
            return new Triangle();
        } else {
            throw new UnsupportedShapeException("图形绘制不支持");
        }
    }

}
