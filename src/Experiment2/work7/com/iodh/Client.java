package Experiment2.work7.com.iodh;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 13:48
 **/
public class Client {
    public static void main(String[] args) {

        VUGCreatorIoDH instance1;
        VUGCreatorIoDH instance2;

        instance1 = VUGCreatorIoDH.getInstance();
        instance2 = VUGCreatorIoDH.getInstance();

        System.out.println(instance1 == instance2);
    }
}
