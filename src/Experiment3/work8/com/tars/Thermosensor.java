package Experiment3.work8.com.tars;

import Experiment3.work8.com.obs.Equipment;

/**
 * @ClassName： Thermosensor
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 16:52
 **/
public class Thermosensor extends AbstractSensor{

    public Thermosensor() {
        System.out.println("------ 温度传感器开始工作 ------");
    }

    @Override
    public void notifyObservers() {
        for (Equipment equipment : observers){
            equipment.response();
        }
    }
}
