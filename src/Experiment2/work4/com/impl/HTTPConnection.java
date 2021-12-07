package Experiment2.work4.com.impl;

/**
 * @ClassName： HTTPConnection
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:17
 **/
public class HTTPConnection implements AbstractConnetion{

    @Override
    public void getConnection() {
        System.out.println("创建HTTP对象！");
    }
}
