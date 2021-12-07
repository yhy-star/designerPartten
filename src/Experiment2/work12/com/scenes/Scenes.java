package Experiment2.work12.com.scenes;

import Experiment2.work12.com.impl.maps.MapImpl;
import Experiment2.work12.com.impl.sounds.SoundImpl;
import Experiment2.work12.com.impl.weathers.WeatherImpl;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName： Scenes
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 20:29
 **/
public abstract class Scenes {

    protected ArrayList<MapImpl> mapImpls;
    protected ArrayList<SoundImpl> soundImpls;
    protected ArrayList<WeatherImpl> weatherImpls;
    protected HashMap hashMap;

    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
        this.mapImpls = (ArrayList<MapImpl>) this.hashMap.get("maps");
        this.soundImpls = (ArrayList<SoundImpl>) this.hashMap.get("sounds");
        this.weatherImpls = (ArrayList<WeatherImpl>) this.hashMap.get("weather");
    }

//    public void setMapImpls(ArrayList<MapImpl> mapImpls) {
//        this.mapImpls = (ArrayList<MapImpl>) this.hashMap.get("maps");
//    }
//
//    public void setSoundImpls(ArrayList<SoundImpl> soundImpls) {
//        this.soundImpls = (ArrayList<SoundImpl>) this.hashMap.get("sounds");
//    }
//
//    public void setWeatherImpls(ArrayList<WeatherImpl> weatherImpls) {
//        this.weatherImpls = (ArrayList<WeatherImpl>) this.hashMap.get("weather");
//    }

    public abstract void createScene();
}
