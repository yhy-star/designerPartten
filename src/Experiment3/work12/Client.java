package Experiment3.work12;

import Experiment3.work12.com.stras.AbstractRendering;
import Experiment3.work12.com.stras.Scene;
import Experiment3.work12.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:15
 **/
public class Client {
    public static void main(String[] args) {

        AbstractRendering rendering;
        Scene scene = new Scene("FPS");

        rendering = (AbstractRendering) XMLUtil.getBean();
        scene.setAbstractRendering(rendering);

        scene.display();
    }
}
