package Experiment3.work1.com;

import java.util.ArrayList;

/**
 * @ClassName： GroupChat
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/23 20:11
 **/
public class GroupChat extends Component {

    private String name;

    private ArrayList<Component> components = new ArrayList<>();

    public GroupChat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

//    public void setComponents(ArrayList<Component> components) {
//        this.components = components;
//    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void chat(Component component) {
        if(component instanceof GroupChat){
            ArrayList<Component> components = ((GroupChat) component).getComponents();
            for (Component object : components){
                object.chat(object);
            }
        } else if (component instanceof Member){
            ((Member)component).onMessage();
        }
    }
}
