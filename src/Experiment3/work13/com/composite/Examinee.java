package Experiment3.work13.com.composite;

/**
 * @ClassName： Examinee
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 21:34
 **/
public class Examinee extends Component{

    private String name;

    public Examinee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addGroup(Component component) {
        System.out.println("该方法对我来说无法实现！");
    }

    @Override
    public void remove(Component component) {
        System.out.println("该方法对我来说无法实现！");
    }

    @Override
    public synchronized void Onmessage(Component component) {
        if (component instanceof Examinee)
        {
            System.out.println("------ " + this.getName()+"收到消息 ------");
        }
    }
}
