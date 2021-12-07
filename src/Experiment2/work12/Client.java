package Experiment2.work12;

import Experiment2.work12.com.impl.maps.MapImpl;
import Experiment2.work12.com.impl.sounds.SoundImpl;
import Experiment2.work12.com.impl.weathers.WeatherImpl;
import Experiment2.work12.com.scenes.Scenes;
import Experiment2.work12.com.scenes.ScenesA;
import Experiment2.work12.util.DemoUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 20:36
 **/
public class Client {
    public static void main(String[] args) throws SAXException, IllegalAccessException, IOException, InstantiationException, ParserConfigurationException, ClassNotFoundException {

        Scenes scenes;

        HashMap hashMap = DemoUtil.getBean();

        scenes = (Scenes) hashMap.get("scene");

        scenes.setHashMap(hashMap);

        scenes.createScene();


    }
}
