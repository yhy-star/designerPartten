package Experiment2.work7.com.hunger;

/**
 * @ClassName： VUGCreator
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 12:44
 **/
public class VUGCreatorHunger {

    private static final VUGCreatorHunger instance = new VUGCreatorHunger();

    private VUGCreatorHunger(){

    }

    public static VUGCreatorHunger getInstance(){
        return instance;
    }
}
