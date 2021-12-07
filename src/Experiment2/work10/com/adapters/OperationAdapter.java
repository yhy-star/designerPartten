package Experiment2.work10.com.adapters;

import Experiment2.work10.com.adaptees.Encrype;
import Experiment2.work10.com.targets.DataRestore;

/**
 * @ClassName： OperationAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 16:13
 **/
public class OperationAdapter implements DataRestore {

    private Encrype encrype;

    public OperationAdapter(){
        encrype = new Encrype();
    }


    @Override
    public void restoreData(String data) {
        System.out.println("对象适配器：");
        System.out.println("先加密数据：");
        encrype.encrypeData(data);
        System.out.println("数据存储完成！");
    }
}
