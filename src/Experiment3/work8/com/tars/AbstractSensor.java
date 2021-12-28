package Experiment3.work8.com.tars;

import Experiment3.work8.com.obs.Equipment;

import java.util.ArrayList;

/**
 * @ClassName： AbstractSensor
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 16:49
 **/
public abstract class AbstractSensor {

    protected String name;
    protected ArrayList<Equipment> observers = new ArrayList<Equipment>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void join(Equipment equipment){
        observers.add(equipment);
    }

    public void remove(Equipment equipment){
        observers.remove(equipment);
    }

    public abstract void notifyObservers();
}
