package Experiment3.work7.com.obs;

import Experiment3.work7.com.tars.TextFiled;

/**
 * @ClassName： WordsText
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 16:10
 **/
public class WordsText implements TextOperation{

    private TextFiled text;
    private String content;

    public void setText(TextFiled text) {
        this.text = text;
    }

    @Override
    public void operation() {
        System.out.println("------ 统计单词 ------");
    }
}
