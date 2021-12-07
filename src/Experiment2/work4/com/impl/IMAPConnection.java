package Experiment2.work4.com.impl;

/**
 * @ClassName： IMAPConnection
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 10:14
 **/
public class IMAPConnection implements AbstractConnetion{

    @Override
    public void getConnection() {
        System.out.println("创建IMAP对象！");
    }
}
