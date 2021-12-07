package Experiment2.work11.com.components;

/**
 * @ClassName： Triangle
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 16:47
 **/
public class Triangle extends Shape{

    @Override
    public void createShape() {
        System.out.println("成功创建三角形！");
        System.out.println("图形生成样式：");
        impl.display();
    }
}
