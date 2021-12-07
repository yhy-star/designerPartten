package Experiment2.work7.com.lazyMan;

/**
 * @ClassName： DoubleCheck
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 13:12
 **/
public class VUGCreatorDoubleCheck {

    private volatile static VUGCreatorDoubleCheck instance = null;

    private VUGCreatorDoubleCheck(){

    }

    public static VUGCreatorDoubleCheck getInstance(){
        // 加双重判断是为了谁更快进入抢占生成实例，提高速度？
        if(instance == null){
            synchronized (VUGCreatorDoubleCheck.class){
                Long time1 = System.currentTimeMillis();
                if(instance == null){
                    instance = new VUGCreatorDoubleCheck();
                    Long time2 = System.currentTimeMillis();
                    System.out.println("双判断总共花费时间：" + (time2 - time1));
                }
            }
        }
        return instance;
    }
}
