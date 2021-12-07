package Experiment2.work4.com.impl;

/**
 * @ClassName： POP3Connection
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:13
 **/
public class POP3Connection implements AbstractConnetion{
    @Override
    public void getConnection() {
        System.out.println("创建POP3对象！");
    }
}
