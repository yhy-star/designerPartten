package Experiment3.work2.com;

/**
 * @ClassName： Cylinder
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/23 20:40
 **/
public class Cylinder extends Component{

    private String name;

    public Cylinder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setFill(String color) {
        System.out.println(this.name +  " 被染成 " + color);
    }

    @Override
    public void add(Component component) {

    }
}
