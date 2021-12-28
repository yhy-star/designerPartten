package Experiment3.work13.com.observers;

import Experiment3.work13.com.composite.Component;

/**
 * @ClassName： Subject
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 21:51
 **/
public abstract class Observer {
    public abstract void notify(Component component);
}
