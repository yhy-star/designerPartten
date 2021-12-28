package Experiment3.work6.com.lights;

/**
 * @ClassName： Lights2
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:17
 **/
public class Lights2 extends Lights {
    @Override
    public void open() {
        System.out.println("------ Lights2 正在发红光 ------");
    }

    @Override
    public void close() {
        System.out.println("------ Lights2 嗝屁了 ------");
    }
}
