package Experiment3.work13.com.composite;

import java.util.ArrayList;

/**
 * @ClassName： Examination
 * @Description：尝试：考生组和候考人分开   这是考生组
 * @Author: yhy
 * @Date： 2021/12/28 21:37
 **/
public class Group extends Component{

    private String name;
    private ArrayList<Component> group = new ArrayList<Component>();

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Component> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<Component> group) {
        this.group = group;
    }

    @Override
    public void addGroup(Component component) {
        group.add(component);
    }


    @Override
    public void remove(Component component) {
        group.remove(component);
    }

    @Override
    public void Onmessage(Component component) {
        if(component instanceof Examinee){
            component.Onmessage(component);
        } else {
            ArrayList<Component> components = ((Group) component).getGroup();
            for (Component obj : components){
                obj.Onmessage(obj);
            }
        }
    }
}
