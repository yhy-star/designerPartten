package Experiment3.work8.com.adps;

import Experiment3.work8.com.obs.Equipment;
import Experiment3.work8.com.obs.SecurityDoor;
import Experiment3.work8.com.tars.AbstractSensor;

/**
 * @ClassName： Adapter1
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 17:06
 **/
public class SecurityDoorAdapter implements Equipment {

    private SecurityDoor securityDoor = new SecurityDoor();

    @Override
    public void response() {
        securityDoor.open();
    }
}
