package Experiment3.work14.com.targets;

/**
 * @ClassName： AutoPaperGeneration
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 21:01
 **/
public class AutoPaperGeneration extends AbstractPaperGeneration{
    @Override
    public void generate() {
        System.out.println("------ 老师：" + name + " ------");
        System.out.println("------ 开始自动生成试卷 -------");
        abstractAlgorithm.generatePaper();
    }
}
