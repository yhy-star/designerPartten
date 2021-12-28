package Experiment3.work14.com.targets;

/**
 * @ClassName： HumanPaperGeneration
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 21:02
 **/
public class HumanPaperGeneration extends AbstractPaperGeneration{

    @Override
    public void generate() {
        System.out.println("------ 老师：" + name + " ------");
        System.out.println("------ 开始手动生成试卷 -------");
        abstractAlgorithm.generatePaper();
    }
}
