package Experiment3.work6.com.orders;

import Experiment3.work6.com.lights.Lights;
import Experiment3.work6.com.lights.Lights5;

/**
 *@ClassName： Comm
 *@Description：
 *@Author: yhy
 *@Date： 2021/12/28 13:32
**/
public class Command5 extends Command{
    private static Lights lights = new Lights5();

    @Override
    public void open() {
        lights.open();
    }

    @Override
    public void close() {
        lights.close();
    }
}
