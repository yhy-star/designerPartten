package Experiment2.work9;

import Experiment2.work9.*;
import Experiment2.work9.com.targets.DataOperation;
import Experiment2.work9.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 15:40
 **/
public class Client {
    public static void main(String[] args) {

        DataOperation dataOperation;
        dataOperation = (DataOperation) XMLUtil.getBean();

        int scores[] = {84,76,50,69,90,91,88,96}; //定义成绩数组
        int result[];
        int score;

        System.out.println("****快速排序****");
        System.out.println("成绩排序结果：");
        result = dataOperation.sort(scores);

        //遍历输出成绩
        for(int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("****二分查找****");

        System.out.println("查找成绩90：");
        score = dataOperation.search(result,90);
        if (score != -1) {
            System.out.println("找到成绩90。");
        }
        else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        score = dataOperation.search(result,92);
        if (score != -1) {
            System.out.println("找到成绩92。");
        }
        else {
            System.out.println("没有找到成绩92。");
        }
    }
}
