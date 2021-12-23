package Experiment3.work2;

import Experiment3.work2.com.*;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/23 20:32
 **/
public class Client {
    public static void main(String[] args) {
        Component component1, component2, component3, component4;
        component1 = new Blindage("掩体！");
        component2 = new Cube("立方体！");
        component3 = new Cylinder("圆柱体！");
        component4 = new Pyramid("锥体！");
        component1.add(component2);
        component1.add(component3);
        component1.add(component4);

        component1.setFill(" 天蓝色！");
    }
}
