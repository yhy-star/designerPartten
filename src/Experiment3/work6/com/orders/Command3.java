package Experiment3.work6.com.orders;

import Experiment3.work6.com.lights.Lights;
import Experiment3.work6.com.lights.Lights3;

/**
 * @ClassName： Command3
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:26
 **/
public class Command3 extends Command{

    private static Lights lights = new Lights3();

    @Override
    public void open() {
        lights.open();
    }

    @Override
    public void close() {
        lights.close();
    }
}
