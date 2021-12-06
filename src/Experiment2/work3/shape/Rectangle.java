package Experiment2.work3.shape;

/**
 * @ClassName： Rectangle
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 18:01
 **/
public class Rectangle implements Shape{

    public Rectangle(){
        System.out.println("矩形已经被创建！");
    }

    @Override
    public void draw() {
        System.out.println("画矩形！");
    }

    @Override
    public void erase() {
        System.out.println("矩形已经被擦除！");
    }
}
