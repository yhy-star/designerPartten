package Experiment2.work5.com.os;

import Experiment2.work5.com.products.buttons.AbstractButton;
import Experiment2.work5.com.products.buttons.WindowsButton;
import Experiment2.work5.com.products.texts.AbstractText;
import Experiment2.work5.com.products.texts.WindowsText;

/**
 * @ClassName： Windows
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:07
 **/
public class Windows implements AbstractOS{

    public Windows(){
        System.out.println("Windows产品族……");
    }

    @Override
    public AbstractButton createButton() {
        return new WindowsButton();
    }

    @Override
    public AbstractText createText() {
        return new WindowsText();
    }
}
