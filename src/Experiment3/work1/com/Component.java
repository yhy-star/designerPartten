package Experiment3.work1.com;

/**
 * @ClassName： AbstractChat
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/20 15:25
 **/
public abstract class Component {
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void chat(Component component);
}
