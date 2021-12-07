package Experiment2.work7.com.lazyMan;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 13:20
 **/
public class Client {
    public static void main(String[] args) {

        VUGCreatorDoubleCheck instance1;
        VUGCreatorDoubleCheck instance2;

        instance1 = VUGCreatorDoubleCheck.getInstance();
        instance2 = VUGCreatorDoubleCheck.getInstance();

        if(instance1 == instance2){
            System.out.println("实例：" + instance1.getClass() + "已经被创建！不能单开！");
        }

        VUGCreatorDoubleCheck1 instance3;
        VUGCreatorDoubleCheck1 instance4;

        instance3 = VUGCreatorDoubleCheck1.getInstance();
        instance4 = VUGCreatorDoubleCheck1.getInstance();
    }
}
