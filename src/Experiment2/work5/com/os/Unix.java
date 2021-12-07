package Experiment2.work5.com.os;

import Experiment2.work5.com.products.buttons.AbstractButton;
import Experiment2.work5.com.products.buttons.UnixButton;
import Experiment2.work5.com.products.texts.AbstractText;
import Experiment2.work5.com.products.texts.UnixText;

/**
 * @ClassName： Unix
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:10
 **/
public class Unix implements AbstractOS{

    public Unix() {
        System.out.println("Unix产品族……");
    }

    @Override
    public AbstractButton createButton() {
        return new UnixButton();
    }

    @Override
    public AbstractText createText() {
        return new UnixText();
    }
}
