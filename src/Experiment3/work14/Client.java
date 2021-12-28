package Experiment3.work14;

import Experiment3.work14.com.adapters.AbstractAlgorithm;
import Experiment3.work14.com.targets.AbstractPaperGeneration;
import Experiment3.work14.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:48
 **/
public class Client {
    public static void main(String[] args) {

        AbstractAlgorithm algorithm;
        AbstractPaperGeneration paperGeneration;

        algorithm = (AbstractAlgorithm) XMLUtil.getBean("adapters");
        paperGeneration = (AbstractPaperGeneration) XMLUtil.getBean("");

        paperGeneration.setAbstractAlgorithm(algorithm);
        paperGeneration.setName("刘伟男神！");

        paperGeneration.generate();
    }
}
