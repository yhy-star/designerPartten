package Experiment3.work11;

import Experiment3.work11.com.infos.GameManager;

/**
 *@ClassName： Client
 *@Description：
 *@Author: yhy
 *@Date： 2021/12/28 19:51
**/
public class Client {
    public static void main(String[] args) {
        GameManager manager = GameManager.GameManagerEnum.GAMEMANAGER.getInstance();
        manager.modify();
    }
}
