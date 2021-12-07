package Experiment2.work7.com.hunger;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 12:44
 **/
public class Client {
    public static void main(String[] args) {

        VUGCreatorHunger vugCreatorHunger1;
        VUGCreatorHunger vugCreatorHunger2;

        vugCreatorHunger1 = VUGCreatorHunger.getInstance();
        vugCreatorHunger2 = VUGCreatorHunger.getInstance();

        if(vugCreatorHunger1 == vugCreatorHunger2){
            System.out.println("实例：" + vugCreatorHunger1.getClass() + "已经被创建！不能单开！");
        }

    }
}
