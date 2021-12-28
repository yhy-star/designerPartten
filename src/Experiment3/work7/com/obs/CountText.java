package Experiment3.work7.com.obs;

import Experiment3.work7.com.tars.TextFiled;

/**
 * @ClassName： CountText
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 16:03
 **/
public class CountText implements TextOperation{

    private TextFiled text;
    private String content;

    public void setText(TextFiled text) {
        this.text = text;
    }

    @Override
    public void operation() {
        System.out.println("------ 统计单词总数和字符数量 ------");
    }
}
