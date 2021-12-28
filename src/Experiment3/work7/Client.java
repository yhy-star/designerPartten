package Experiment3.work7;

import Experiment3.work7.com.obs.CountText;
import Experiment3.work7.com.obs.FrequenceText;
import Experiment3.work7.com.obs.TextOperation;
import Experiment3.work7.com.obs.WordsText;
import Experiment3.work7.com.tars.AbstractText;
import Experiment3.work7.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 15:59
 **/
public class Client {
    public static void main(String[] args) {

        TextOperation freText, couText, wordText;
        AbstractText operation;

        freText = new FrequenceText();
        couText = new CountText();
        wordText = new WordsText();

        operation = (AbstractText) XMLUtil.getBean();
        operation.join(freText);
        operation.join(couText);
        operation.join(wordText);

        operation.notifyObserver();

    }
}
