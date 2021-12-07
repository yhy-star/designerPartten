package Experiment2.work5;

import Experiment2.work5.com.os.AbstractOS;
import Experiment2.work5.com.products.buttons.AbstractButton;
import Experiment2.work5.com.products.texts.AbstractText;
import Experiment2.work5.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:11
 **/
public class Client {
    public static void main(String[] args) {
        try {

            AbstractOS os;
            AbstractButton button;
            AbstractText text;

            os = (AbstractOS) XMLUtil.getBean();
            button = os.createButton();
            text = os.createText();

            button.display();
            text.display();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
