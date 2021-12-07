package Experiment2.work11.com.components;

/**
 * @ClassName： Circle
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 16:43
 **/
public class Circle extends Shape{

    @Override
    public void createShape() {
        System.out.println("成功创建圆！");
        System.out.println("图形生成样式：");
        impl.display();
    }
}
