package Experiment3.work8.com.adps;

import Experiment3.work8.com.obs.Annunciator;
import Experiment3.work8.com.obs.Equipment;
import Experiment3.work8.com.obs.SecurityDoor;

/**
 * @ClassName： AnnunciatorAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 18:13
 **/
public class AnnunciatorAdapter implements Equipment {

    private Annunciator annunciator = new Annunciator();

    @Override
    public void response() {
        annunciator.alarm();
    }
}
