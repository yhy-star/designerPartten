package Experiment3.work13.com.observers;

import Experiment3.work13.com.composite.Component;

/**
 * @ClassName： GroupObserver
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 22:45
 **/
public class GroupObserver extends Observer{

    @Override
    public void notify(Component component) {
        component.Onmessage(component);
    }
}
