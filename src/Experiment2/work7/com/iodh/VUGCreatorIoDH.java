package Experiment2.work7.com.iodh;

/**
 * @ClassName： VUGCreatorIoDH
 * @Description：静态内部类实现单例模式
 * @Author: yhy
 * @Date： 2021/12/7 13:31
 **/
public class VUGCreatorIoDH {

    private VUGCreatorIoDH(){

    }

    // 静态内部类
    private static class HolderClass{
        private final static VUGCreatorIoDH instance = new VUGCreatorIoDH();
    }

    public static VUGCreatorIoDH getInstance(){
        return HolderClass.instance;
    }
}
