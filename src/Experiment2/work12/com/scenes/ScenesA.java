package Experiment2.work12.com.scenes;

import Experiment2.work12.com.impl.maps.MapImpl;
import Experiment2.work12.com.impl.sounds.SoundImpl;
import Experiment2.work12.com.impl.weathers.WeatherImpl;

/**
 * @ClassName： ScenesA
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 20:30
 **/
public class ScenesA extends Scenes{

    @Override
    public void createScene() {
        System.out.println("场景A开始生成……");

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
