package Experiment3.work6.com.orders;

import Experiment3.work6.com.lights.Lights;
import Experiment3.work6.com.lights.Lights2;

/**
 * @ClassName： Command2
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:26
 **/
public class Command2 extends Command{
    private static Lights lights = new Lights2();

    @Override
    public void open() {
        lights.open();
    }

    @Override
    public void close() {
        lights.close();
    }
}
