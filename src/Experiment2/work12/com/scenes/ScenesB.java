package Experiment2.work12.com.scenes;

import Experiment2.work12.com.impl.maps.MapImpl;
import Experiment2.work12.com.impl.sounds.SoundImpl;
import Experiment2.work12.com.impl.weathers.WeatherImpl;

/**
 * @ClassName： ScenesB
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 20:36
 **/
public class ScenesB extends Scenes{

    @Override
    public void createScene() {
        System.out.println("场景B开始生成……");

        for (MapImpl map : mapImpls){
            map.display();
        }

        for (SoundImpl sound : soundImpls){
            sound.display();
        }

        for (WeatherImpl weather : weatherImpls){
            weather.display();
        }
    }
}
