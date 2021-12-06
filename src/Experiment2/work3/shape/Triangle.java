package Experiment2.work3.shape;

/**
 * @ClassName： Triangle
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 18:33
 **/
public class Triangle implements Shape{

    public Triangle(){
        System.out.println("三角形已经被创建！");
    }

    @Override
    public void draw() {
        System.out.println("画三角形！");
    }

    @Override
    public void erase() {
        System.out.println("三角形已经被擦除！");
    }
}
