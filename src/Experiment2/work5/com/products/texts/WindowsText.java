package Experiment2.work5.com.products.texts;

/**
 * @ClassName： WindowsText
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:03
 **/
public class WindowsText implements AbstractText{

    public WindowsText(){
        System.out.println("创建WindowsText！");
    }

    @Override
    public void display() {
        System.out.println("WindowsText具体业务……");
    }
}
