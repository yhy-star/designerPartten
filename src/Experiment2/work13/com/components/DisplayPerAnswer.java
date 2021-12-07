package Experiment2.work13.com.components;

/**
 * @ClassName： DisplayPerAnswer
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 22:34
 **/
public class DisplayPerAnswer extends DataAnalysis{

    @Override
    public void analysis() {
        System.out.println("展示每一道题目的正确率!");
        impl.downData();
    }
}
