package Experiment2.work8;

import Experiment2.work8.com.deepClone.DeepClone;
import Experiment2.work8.com.deepClone.PictureDeep;

import java.io.IOException;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 14:38
 **/
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        // 检测浅克隆
//        System.out.println("****浅克隆****");
//        Picture picture = new Picture();
//        picture.setName("美照");
//        ShallowClone s = new ShallowClone();
//        s.setName("张三");
//        s.setDepartment("法外狂徒");
//        s.setPicture(picture);
//
//        System.out.println("名字：" + s.getName());
//        System.out.println("职位：" + s.getDepartment());
//        s.getPicture().modifyPicture();
//        System.out.println("--------------------------------");
//
//        ShallowClone shallowClone;
//        shallowClone = s.clone();
//        System.out.println("****浅克隆****");
//        shallowClone.getPicture().setName("未P的照片");
//
//        System.out.println("名字：" + shallowClone.getName());
//        System.out.println("职位：" + shallowClone.getDepartment());
//        shallowClone.getPicture().modifyPicture();
//        System.out.println(s.getPicture().getName());
//        System.out.println("--------------------------------");

        // 深克隆
        System.out.println("****深克隆****");
        PictureDeep picture = new PictureDeep();
        picture.setName("美照");
        DeepClone s = new DeepClone();
        s.setName("张三");
        s.setDepartment("法外狂徒");
        s.setPicture(picture);

        System.out.println("名字：" + s.getName());
        System.out.println("职位：" + s.getDepartment());
        s.getPicture().modifyPicture();
        System.out.println("--------------------------------");

        DeepClone deepClone;
        deepClone = s.deepClone();
        System.out.println("****深克隆****");
        deepClone.getPicture().setName("未P的照片");

        System.out.println("名字：" + deepClone.getName());
        System.out.println("职位：" + deepClone.getDepartment());
        deepClone.getPicture().modifyPicture();
        System.out.println(s.getPicture().getName());
        System.out.println("--------------------------------");


    }
}
