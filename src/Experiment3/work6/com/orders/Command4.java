package Experiment3.work6.com.orders;

import Experiment3.work6.com.lights.Lights;
import Experiment3.work6.com.lights.Lights4;

/**
 * @ClassName： Command4
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 13:26
 **/
public class Command4 extends Command{
    private static Lights lights = new Lights4();

    @Override
    public void open() {
        lights.open();
    }

    @Override
    public void close() {
        lights.close();
    }
}
