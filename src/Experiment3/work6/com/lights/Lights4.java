package Experiment3.work6.com.lights;

/**
 * @ClassName： Lights4
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:17
 **/
public class Lights4 extends Lights{
    @Override
    public void open() {
        System.out.println("------ Lights4 正在发绿光 ------");
    }

    @Override
    public void close() {
        System.out.println("------ Lights4 嗝屁了 ------");
    }
}
