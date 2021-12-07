package Experiment2.work5.com.products.texts;

/**
 * @ClassName： UnixText
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:02
 **/
public class UnixText implements AbstractText{

    public UnixText(){
        System.out.println("创建UnixText！");
    }

    @Override
    public void display() {
        System.out.println("UnixText具体业务……");
    }
}
