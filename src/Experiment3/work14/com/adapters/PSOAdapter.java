package Experiment3.work14.com.adapters;

import Experiment3.work14.com.algorithms.PSO;

/**
 * @ClassName： PSOAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:53
 **/
public class PSOAdapter implements AbstractAlgorithm {

    private PSO pso = new PSO();

    @Override
    public void generatePaper() {
        pso.algorithm();
        System.out.println("------ 用pso算法开始生成试卷 ------");
    }
}
