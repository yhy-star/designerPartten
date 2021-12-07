package Experiment2.work12.util;

import Experiment2.work12.com.impl.maps.MapImpl;
import Experiment2.work12.com.impl.sounds.SoundImpl;
import Experiment2.work12.com.impl.weathers.WeatherImpl;
import Experiment2.work12.com.scenes.Scenes;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @ClassName： DemoUtil
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 18:21
 **/
public class DemoUtil {

    private static ArrayList<MapImpl> gameMaps = new ArrayList<>();
    private static ArrayList<SoundImpl> gameSounds = new ArrayList<>();
    private static ArrayList<WeatherImpl> gameWeathers = new ArrayList<>();

    private static HashMap infoMap = new HashMap();

    public static HashMap getBean() throws ParserConfigurationException, IOException, SAXException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dFactory.newDocumentBuilder();
        Document doc;
        doc = builder.parse(new File("G:/designerPartten/src/Experiment2/work12/util/config.xml"));

        Node node = null;
        String cName = null;

        NodeList nl = doc.getElementsByTagName("config");
        for (int i = 0; i < nl.getLength(); i++){
            Element detail = (Element) nl.item(i);
            // 获得地图信息
            Element maps = (Element) detail.getElementsByTagName("maps").item(0);
            NodeList map = maps.getElementsByTagName("className");
//            System.out.println(map.getLength());
            for (int j = 0; j < map.getLength(); j++){
                node = map.item(j).getFirstChild();
                cName = node.getNodeValue();
                Class c = Class.forName(cName);
                Object obj = c.newInstance();
                MapImpl impl = (MapImpl) obj;
//                impl.display();
                gameMaps.add(impl);
            }
            infoMap.put("maps", gameMaps);
            // 获得背景音乐信息
            Element sounds = (Element) detail.getElementsByTagName("sounds").item(0);
            NodeList sound = sounds.getElementsByTagName("className");
//            System.out.println(sound.getLength());
            for (int k = 0; k < sound.getLength(); k++){
                node = sound.item(k).getFirstChild();
                cName = node.getNodeValue();
                Class c = Class.forName(cName);
                Object obj = c.newInstance();
                SoundImpl impl = (SoundImpl) obj;
                gameSounds.add(impl);
            }
            infoMap.put("sounds", gameSounds);
            // 获得游戏天气信息
            Element weathers = (Element) detail.getElementsByTagName("weathers").item(0);
            NodeList weather = weathers.getElementsByTagName("className");
//            System.out.println(weather.getLength());
            for (int l = 0; l < weather.getLength(); l++){
                node = weather.item(l).getFirstChild();
                cName = node.getNodeValue();
                Class c = Class.forName(cName);
                Object obj = c.newInstance();
                WeatherImpl impl = (WeatherImpl) obj;
                gameWeathers.add(impl);
            }
            infoMap.put("weather", gameWeathers);
            // 获得场景信息
            Element scene = (Element) detail.getElementsByTagName("scenes").item(0);
            NodeList scenes = scene.getElementsByTagName("className");
            node = scenes.item(0).getFirstChild();
            cName = node.getNodeValue();
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            Scenes scenes1 = (Scenes) obj;
            infoMap.put("scene", scenes1);
        }
        return infoMap;
    }

//    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, IllegalAccessException, InstantiationException, ClassNotFoundException {
//
//        HashMap infoMap = getBean();
//
//        ArrayList<MapImpl> maps = (ArrayList<MapImpl>) infoMap.get("maps");
//        ArrayList<SoundImpl> sounds = (ArrayList<SoundImpl>) infoMap.get("sounds");
//        ArrayList<WeatherImpl> weathers = (ArrayList<WeatherImpl>) infoMap.get("weather");
//
//        for (MapImpl map : maps){
//            map.display();
//        }
//
//        for (SoundImpl sound : sounds){
//            sound.display();
//        }
//
//        for (WeatherImpl weather : weathers){
//            weather.display();
//        }
//
//    }
}
