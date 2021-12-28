package Experiment3.work14.com.adapters;

import Experiment3.work14.com.algorithms.ATPG;
import Experiment3.work14.com.algorithms.GA;

/**
 * @ClassName： ATPGAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:56
 **/
public class ATPGAdapter implements AbstractAlgorithm{

    private ATPG atpg = new ATPG();

    @Override
    public void generatePaper() {
        atpg.algorithm();
        System.out.println("------ 用atpg算法开始生成试卷 ------");
    }
}
