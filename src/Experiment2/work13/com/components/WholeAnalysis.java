package Experiment2.work13.com.components;

/**
 * @ClassName： WholeAnalysis
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 22:30
 **/
public class WholeAnalysis extends DataAnalysis{

    @Override
    public void analysis() {
        System.out.println("分析整套试卷的成绩分布！");
        impl.downData();
    }
}
