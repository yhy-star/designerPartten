package Experiment2.work5.com.products.texts;

/**
 * @ClassName： LinuxText
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:01
 **/
public class LinuxText implements AbstractText{

    public LinuxText(){
        System.out.println("创建LinuxText！");
    }

    @Override
    public void display() {
        System.out.println("LinuxText具体业务……");
    }
}
