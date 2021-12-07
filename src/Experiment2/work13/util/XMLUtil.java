package Experiment2.work13.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * @ClassName： XMLUtil
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/6 19:33
 **/
public class XMLUtil {

    public static Object getBean(String args){
        try {

            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("G:/designerPartten/src/Experiment2/work13/util/config.xml"));

            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = doc.getElementsByTagName("className");

            if(args.equals("analysis")){
                // 获取第一个属性
                classNode = nl.item(0).getFirstChild();
            } else if(args.equals("data")){
                classNode = nl.item(1).getFirstChild();
            }

            cName = classNode.getNodeValue();
            Class c = Class.forName(cName);
            Object object = c.newInstance();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

//    public static void main(String[] args) {
//        String path = XMLUtil.class.getResource("").getPath();
//        System.out.println(path);
//    }
}
