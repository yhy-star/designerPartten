package Experiment3.work10.com.tem;

/**
 * @ClassName： DataTemplate
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 19:07
 **/
public abstract class DataTemplate {

    public void readData(){
        System.out.println("------ 读取数据 ------");
    }

    public void convertData(){
        System.out.println("------ 转换数据格式 ------");
    }

    public abstract void dataAlgorithm();

    public void displayData(){
        System.out.println("------ 显示数据结果 ------");
    }
}
