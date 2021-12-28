package Experiment3.work8.com.adps;

import Experiment3.work8.com.obs.CautionLight;
import Experiment3.work8.com.obs.Equipment;

/**
 * @ClassName： CautionLightAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 18:13
 **/
public class CautionLightAdapter implements Equipment {

    private CautionLight cautionLight = new CautionLight();


    @Override
    public void response() {
        cautionLight.flicker();
    }
}
