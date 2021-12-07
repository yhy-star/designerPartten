package Experiment2.work5.com.products.buttons;

/**
 * @ClassName： LinuxButton
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:58
 **/
public class LinuxButton implements AbstractButton{

    public LinuxButton() {
        System.out.println("创建LinuxButton！");
    }

    @Override
    public void display() {
        System.out.println("LinuxButton具体业务……");
    }
}
