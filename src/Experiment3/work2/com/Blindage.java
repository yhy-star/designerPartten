package Experiment3.work2.com;

import java.util.ArrayList;

/**
 * @ClassName： Blindage
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/23 20:42
 **/
public class Blindage extends Component{

    private String name;

    private ArrayList<Component> components = new ArrayList<>();

    public Blindage(String name) {
        this.name = name;
    }

    public ArrayList<Component> getComponents() {

        return components;
    }

    public String getName() {
        return name;
    }

    public void add(Component component){
        components.add(component);
    }

    @Override
    public void setFill(String color) {
            for (Component obj : components){
                obj.setFill(color);
            }
    }
}
