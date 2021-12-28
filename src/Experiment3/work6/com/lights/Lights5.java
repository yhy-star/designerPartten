package Experiment3.work6.com.lights;

/**
 * @ClassName： Lights5
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:17
 **/
public class Lights5 extends Lights{
    @Override
    public void open() {
        System.out.println("------ Lights5 正在发白光 ------");
    }

    @Override
    public void close() {
        System.out.println("------ Lights5 嗝屁了 ------");
    }
}
