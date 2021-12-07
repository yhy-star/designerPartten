package Experiment2.work13.com.components;

import Experiment2.work13.com.impl.DataDownloadImpl;

/**
 * @ClassName： DataAnalysis
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 22:23
 **/
public abstract class DataAnalysis {

    protected DataDownloadImpl impl;

    public void setImpl(DataDownloadImpl impl){
        this.impl = impl;
    }

    public abstract void analysis();
}
