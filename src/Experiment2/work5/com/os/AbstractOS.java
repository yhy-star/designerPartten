package Experiment2.work5.com.os;

import Experiment2.work5.com.products.buttons.AbstractButton;
import Experiment2.work5.com.products.texts.AbstractText;

/**
 * @ClassName： AbstractOS
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:05
 **/
public interface AbstractOS {
    public AbstractButton createButton();
    public AbstractText createText();
}
