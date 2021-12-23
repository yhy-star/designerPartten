package Experiment3.work1.com;

import java.util.ArrayList;

/**
 * @ClassName： MemberA
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/20 15:27
 **/
public class Member extends Component{

    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        System.out.println("该方法对我来说无法实现！");
    }

    @Override
    public void remove(Component component) {
        System.out.println("该方法对我来说无法实现！");
    }

    public void onMessage() {
        System.out.println(this.getName()+"收到消息");

    }

    @Override
    public void chat(Component component) {
        if(component instanceof GroupChat){
            ArrayList<Component> components = ((GroupChat) component).getComponents();
            if(components.contains(this)){
                components.remove(this);
            }
            for (Component component1 : components){
                component1.chat(component1);
            }
            components.add(this);
        } else if (component instanceof Member){
            ((Member) component).onMessage();
        }
    }
}
