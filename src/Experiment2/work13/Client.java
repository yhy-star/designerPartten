package Experiment2.work13;

import Experiment2.work13.com.components.DataAnalysis;
import Experiment2.work13.com.impl.DataDownloadImpl;
import Experiment2.work13.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 22:36
 **/
public class Client {
    public static void main(String[] args) {

        DataAnalysis analysis;
        DataDownloadImpl impl;

//        analysis = new WholeAnalysis();
//        impl = new ExcelData();

        analysis = (DataAnalysis) XMLUtil.getBean("analysis");
        impl = (DataDownloadImpl) XMLUtil.getBean("data");

        analysis.setImpl(impl);
        analysis.analysis();
    }
}
