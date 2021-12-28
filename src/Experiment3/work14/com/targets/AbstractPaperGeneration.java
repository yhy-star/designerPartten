package Experiment3.work14.com.targets;

import Experiment3.work14.com.adapters.AbstractAlgorithm;

/**
 * @ClassName： AbstractPaperGeneration
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:58
 **/
public abstract class AbstractPaperGeneration {

    protected String name;
    protected AbstractAlgorithm abstractAlgorithm;

    public void setName(String name) {
        this.name = name;
    }

    public void setAbstractAlgorithm(AbstractAlgorithm abstractAlgorithm) {
        this.abstractAlgorithm = abstractAlgorithm;
    }

    public abstract void generate();
}
