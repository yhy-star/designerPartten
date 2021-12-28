package Experiment3.work6.com.lights;

/**
 * @ClassName： Lights1
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:14
 **/
public class Lights1 extends Lights{

    @Override
    public void open() {
        System.out.println("------ Lights1 正在发蓝光 ------");
    }

    @Override
    public void close() {
        System.out.println("------ Lights1 嗝屁了 ------");
    }
}
