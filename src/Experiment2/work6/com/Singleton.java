package Experiment2.work6.com;

import Experiment2.work6.util.XMLUtil;

import java.util.ArrayList;

/**
 * @ClassName： Singleton
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:19
 **/
public class Singleton {
    private static Singleton instance = null;
    private static int instancesSize = (Integer) XMLUtil.getBean();
    private static ArrayList<Singleton> instances = new ArrayList<Singleton>();
    private static int currentSize = 0;

    synchronized public static Singleton getInstance(){
        if(currentSize < instancesSize){
            System.out.println("生成新的实例，当前实例为第 " + ++currentSize + " 个实例！");
            instance = new Singleton();
            instances.add(instance);
        } else {
            System.out.println("当前实例数已为最大！");
        }
        return instance;
    }

    public static ArrayList<Singleton> getInstances(){
        return  instances;
    }
}
