package Experiment2.work12.util;

import Experiment2.work12.com.impl.maps.MapImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

/**
 * @ClassName： XMLUtil
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 19:33
 **/
public class XMLUtil {
// String args
    public static void getBean(){
        try {

            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("G:/designerPartten/src/Experiment2/work12/util/config.xml"));

            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = doc.getElementsByTagName("maps");
            System.out.println(nl.item(0));

//            if(args.equals("analysis")){
//                // 获取第一个属性
//                classNode = nl.item(0).getFirstChild();
//            } else if(args.equals("data")){
//                classNode = nl.item(1).getFirstChild();
//            }
//            ArrayList<MapImpl> maps = new ArrayList<MapImpl>();
//            for (int i = 0; i < nl.getLength(); i++){
//                classNode = nl.item(i).getFirstChild();
//                cName = classNode.getNodeValue();
//                Class c = Class.forName(cName);
//                Object obj = c.newInstance();
//                MapImpl impl = (MapImpl)obj;
//                maps.add(impl);
//            }
//            for (MapImpl map : maps){
//                map.display();
//            }
//            classNode = nl.item(0).getFirstChild();
//            cName = classNode.getNodeValue();
//            Class c = Class.forName(cName);
//            Object object = c.newInstance();
//            return object;
        } catch (Exception e) {
            e.printStackTrace();
//            return null;
        }
    }

    public static void main(String[] args) {
        getBean();
        System.out.println();
    }
}
