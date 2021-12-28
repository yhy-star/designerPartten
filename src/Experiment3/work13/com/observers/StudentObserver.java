package Experiment3.work13.com.observers;

import Experiment3.work13.com.composite.Component;

/**
 * @ClassName： System
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 21:58
 **/
public class StudentObserver extends Observer {

    @Override
    public void notify(Component component) {
        component.Onmessage(component);
    }
}
