package Experiment3.work13.com.composite;

/**
 * @ClassName： Component
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 21:31
 **/
public abstract class Component {
    public abstract void addGroup(Component component);
    public abstract void remove(Component component);
    public abstract void Onmessage(Component component);
}
