package Experiment2.work6;

import Experiment2.work6.com.Singleton;

import java.util.ArrayList;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 11:32
 **/
public class Client {
    public static void main(String[] args) {

        Singleton singleton1;
        Singleton singleton2;
        Singleton singleton3;
        Singleton singleton4;

        singleton1 = Singleton.getInstance();
        singleton2 = Singleton.getInstance();
        singleton3 = Singleton.getInstance();
        singleton4 = Singleton.getInstance();

        ArrayList instances = Singleton.getInstances();

        for (Object single : instances){
            System.out.println(single);
        }
    }
}
