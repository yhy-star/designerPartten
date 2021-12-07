package Experiment2.work10.com.adapters;

import Experiment2.work10.com.adaptees.Encrype;
import Experiment2.work10.com.targets.DataRestore;

/**
 * @ClassName： ClassAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 16:22
 **/
public class ClassAdapter extends Encrype implements DataRestore {

    @Override
    public void restoreData(String data) {
        System.out.println("类适配器：");
        System.out.println("先加密数据：");
        super.encrypeData(data);
        System.out.println("数据存储完成！");
    }
}
