package Experiment3.work5.com.chains;

/**
 * @ClassName： DataValidate
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 12:57
 **/
public class DataValidate extends DataFilter{

    public DataValidate(String name) {
        super(name);
    }

    @Override
    public void processRequest(Data data, String type) {
        if(type == "数据校验"){
            System.out.println("------ 正在进行数据校验 ------");
            System.out.println("------ 数据名称：" + data.getName() + " ------");
        } else if(type=="数据全处理") {
            System.out.println("------ 正在进行数据校验 ------");
            System.out.println("------ 数据名称：" + data.getName() + " ------");
            if(this.successor != null){
                this.successor.processRequest(data, type);
            }
        } else {
            this.successor.processRequest(data, type);
        }
    }
}
