package Experiment3.work6.com.orders;

import Experiment3.work6.com.lights.Lights;
import Experiment3.work6.com.lights.Lights1;

/**
 * @ClassName： Command1
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:24
 **/
public class Command1 extends Command{

    private static Lights lights = new Lights1();

    @Override
    public void open() {
        lights.open();
    }

    @Override
    public void close() {
        lights.close();
    }
}
