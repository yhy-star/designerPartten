package Experiment3.work2.com;

/**
 * @ClassName： Pyramid
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/23 20:41
 **/
public class Pyramid extends Component{

    private String name;

    public Pyramid(String name) {
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
