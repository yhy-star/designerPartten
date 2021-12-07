package Experiment2.work11.com.components;

import Experiment2.work11.com.impl.Impl;

/**
 * @ClassName： Shape
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 16:42
 **/
public abstract class Shape {
    protected Impl impl;

    public void setImpl(Impl impl) {
        this.impl = impl;
    }

    public abstract void createShape();
}
