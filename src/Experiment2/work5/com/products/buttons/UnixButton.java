package Experiment2.work5.com.products.buttons;

/**
 * @ClassName： UnixButton
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:59
 **/
public class UnixButton implements AbstractButton{

    public UnixButton(){
        System.out.println("创建UnixButton！");
    }

    @Override
    public void display() {
        System.out.println("UnixButton具体业务……");
    }
}
