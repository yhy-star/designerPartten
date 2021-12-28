package Experiment3.work6.com.lights;

/**
 * @ClassName： Lights3
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:17
 **/
public class Lights3 extends Lights{
    @Override
    public void open() {
        System.out.println("------ Lights3 正在发粉光 ------");
    }

    @Override
    public void close() {
        System.out.println("------ Lights3 嗝屁了 ------");
    }
}
