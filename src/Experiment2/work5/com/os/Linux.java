package Experiment2.work5.com.os;

import Experiment2.work5.com.products.buttons.AbstractButton;
import Experiment2.work5.com.products.buttons.LinuxButton;
import Experiment2.work5.com.products.texts.AbstractText;
import Experiment2.work5.com.products.texts.LinuxText;

/**
 * @ClassName： Linux
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:09
 **/
public class Linux implements AbstractOS{

    public Linux(){
        System.out.println("Linux产品族……");
    }

    @Override
    public AbstractButton createButton() {
        return new LinuxButton();
    }

    @Override
    public AbstractText createText() {
        return new LinuxText();
    }
}
