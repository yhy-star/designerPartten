package Experiment3.work7.com.tars;

import Experiment3.work7.com.obs.TextOperation;

/**
 * @ClassName： TextFiled
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 16:02
 **/
public class TextFiled extends AbstractText{

    private String text;

    public TextFiled() {
    }

    public TextFiled(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void notifyObserver() {
        for (TextOperation operation : observers){
            operation.operation();
        }
    }
}
