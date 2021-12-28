package Experiment3.work5.com.chains;

/**
 * @ClassName： DataConverse
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 12:53
 **/
public class DataConverse extends DataFilter{

    public DataConverse(String name) {
        super(name);
    }

    @Override
    public void processRequest(Data data, String type) {
        if(type == "数据类型转换"){
            System.out.println("------ 正在进行数据类型转换 ------");
            System.out.println("------ 数据名称：" + data.getName() + " ------");
        }else if (type == "数据全处理"){
            System.out.println("------ 正在进行数据类型转换 ------");
            System.out.println("------ 数据名称：" + data.getName() + " ------");
            if(this.successor != null){
                this.successor.processRequest(data, type);
            }
        } else {
            this.successor.processRequest(data, type);
        }
    }
}
