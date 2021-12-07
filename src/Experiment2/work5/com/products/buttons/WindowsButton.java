package Experiment2.work5.com.products.buttons;

/**
 * @ClassName： WindowsButton
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:54
 **/
public class WindowsButton implements AbstractButton{

    @Override
    public void display() {
        System.out.println("WindowsButton具体业务……");
    }

    public WindowsButton(){
        System.out.println("创建WindowsButton！");
    }

}
