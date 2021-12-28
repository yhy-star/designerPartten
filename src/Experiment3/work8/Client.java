package Experiment3.work8;

import Experiment3.work8.com.obs.Equipment;
import Experiment3.work8.com.tars.AbstractSensor;
import Experiment3.work8.com.tars.Thermosensor;
import Experiment3.work8.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 16:08
 **/
public class Client {
    public static void main(String[] args) {

        AbstractSensor abstractSensor = new Thermosensor();

        Equipment ann, cau, ins, sec;
        ann = (Equipment) XMLUtil.getBean(0);
        cau = (Equipment) XMLUtil.getBean(1);
        ins = (Equipment) XMLUtil.getBean(2);
        sec = (Equipment) XMLUtil.getBean(3);

        abstractSensor.join(ann);
        abstractSensor.join(cau);
        abstractSensor.join(ins);
        abstractSensor.join(sec);

        abstractSensor.notifyObservers();

    }
}
