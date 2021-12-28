package Experiment3.work13;

import Experiment3.work1.com.Member;
import Experiment3.work13.com.composite.CandidatesList;
import Experiment3.work13.com.composite.Component;
import Experiment3.work13.com.composite.Examinee;
import Experiment3.work13.com.composite.Group;
import Experiment3.work13.com.observers.Observer;
import Experiment3.work13.com.util.XMLUtil;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:39
 **/
public class Client {
    public static void main(String[] args) {

        // 考生组
        Component group = new Group("Group");
        Component groupMax = new Group("BigGroup");
        //候考人列表
        Component candi = new CandidatesList("Can");

        Component member1 = new Examinee("member1");

        Component member2 = new Examinee("member2");

        Component member3 = new Examinee("member3");

        Component member4 = new Examinee("member4");

        Component member5 = new Examinee("member5");

        Component member6 = new Examinee("member6");

        Component member7 = new Examinee("member7");

        Component member8 = new Examinee("member8");

        group.addGroup(member1);
        group.addGroup(member2);
        group.addGroup(member3);
        group.addGroup(member4);

        candi.addGroup(member5);
        candi.addGroup(member6);
        candi.addGroup(member7);
        candi.addGroup(member8);

        groupMax.addGroup(member5);
        groupMax.addGroup(group);

        candi.addGroup(groupMax);

        Observer observer = (Observer) XMLUtil.getBean();
        observer.notify(member1);

    }
}
