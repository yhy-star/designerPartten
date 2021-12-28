package Experiment3.work14.com.adapters;

import Experiment3.work14.com.algorithms.Others;
import Experiment3.work14.com.algorithms.PSO;

/**
 * @ClassName： OtherAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:57
 **/
public class OtherAdapter implements AbstractAlgorithm{

    private Others others = new Others();

    @Override
    public void generatePaper() {
        others.algorithm();
        System.out.println("------ 用其它更牛逼的算法开始生成试卷 ------");
    }
}
