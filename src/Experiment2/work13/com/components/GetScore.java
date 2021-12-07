package Experiment2.work13.com.components;

/**
 * @ClassName： GetScore
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 22:33
 **/
public class GetScore extends DataAnalysis{

    @Override
    public void analysis() {
        System.out.println("根据知识点来统计考生的得分情况!");
        impl.downData();
    }
}
