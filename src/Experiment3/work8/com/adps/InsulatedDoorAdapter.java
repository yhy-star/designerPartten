package Experiment3.work8.com.adps;

import Experiment3.work8.com.obs.Equipment;
import Experiment3.work8.com.obs.InsulatedDoor;

/**
 * @ClassName： InsulatedDoorAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 18:13
 **/
public class InsulatedDoorAdapter implements Equipment {

    private InsulatedDoor insulatedDoor = new InsulatedDoor();

    @Override
    public void response() {
        insulatedDoor.close();
    }
}
