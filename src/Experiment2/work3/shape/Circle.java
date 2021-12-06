package Experiment2.work3.shape;

/**
 * @ClassName： Circle
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 17:55
 **/
public class Circle implements Shape{


    public Circle(){
        System.out.println("圆已经被创建！");
    }

    @Override
    public void draw() {
        System.out.println("画圆!");
    }

    @Override
    public void erase() {
        System.out.println("圆已经被擦除！");
    }
}
