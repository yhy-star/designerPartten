package Experiment3.work14.com.adapters;

import Experiment3.work14.com.algorithms.GA;
import Experiment3.work14.com.algorithms.PSO;

/**
 * @ClassName： GAAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:55
 **/
public class GAAdapter implements AbstractAlgorithm{

    private GA ga = new GA();

    @Override
    public void generatePaper() {
        ga.algorithm();
        System.out.println("------ 用ga算法开始生成试卷 ------");
    }
}
