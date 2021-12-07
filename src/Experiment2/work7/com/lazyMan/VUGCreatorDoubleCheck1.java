package Experiment2.work7.com.lazyMan;

/**
 * @ClassName： VUGCreatorDoubleCheck1
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 13:33
 **/
public class VUGCreatorDoubleCheck1 {
    private volatile static VUGCreatorDoubleCheck1 instance = null;

    private VUGCreatorDoubleCheck1(){

    }

    public static VUGCreatorDoubleCheck1 getInstance(){

        // 加双重判断是为了谁更快进入抢占生成实例，提高速度？
        synchronized (VUGCreatorDoubleCheck1.class){
            Long time1 = System.currentTimeMillis();
            if(instance == null){
                instance = new VUGCreatorDoubleCheck1();
                Long time2 = System.currentTimeMillis();
                System.out.println("单判断总共花费时间：" + (time2 - time1));
            }
        }
        return instance;
    }
}
