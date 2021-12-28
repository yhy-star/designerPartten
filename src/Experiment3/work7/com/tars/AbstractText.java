package Experiment3.work7.com.tars;

import Experiment3.work7.com.obs.TextOperation;

import java.util.ArrayList;

/**
 * @ClassName： AbstractText
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 16:18
 **/
public abstract class AbstractText {
    protected String name;
    protected ArrayList<TextOperation> observers = new ArrayList<TextOperation>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void join(TextOperation operation){
        observers.add(operation);
    }

    public void remove(TextOperation operation){
        observers.remove(operation);
    }

    public abstract void notifyObserver();
}
