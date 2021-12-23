package Experiment3.work1;

import Experiment3.work1.com.Component;
import Experiment3.work1.com.GroupChat;
import Experiment3.work1.com.Member;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/20 15:24
 **/
public class Client {
    public static void main(String[] args) {
        Component group1 = new GroupChat("Group1");

        Component member1 = new Member("member1");

        Component member2 = new Member("member2");

        Component member3 = new Member("member3");

        Component member4 = new Member("member4");

        group1.add(member1);

        group1.add(member2);

        group1.add(member3);

        group1.add(member4);

        System.out.println(((Member)member1).getName()+"分享了一条新动态");

        member1.chat(group1);

        System.out.println("---------------------------");

        Component group2 = new GroupChat("group2");

        group2.add(group1);

        Component member5 = new Member("member5");

        group2.add(member5);

        System.out.println(((Member)member5).getName()+"分享了一条新动态");

        member5.chat(group2);

    }
}
