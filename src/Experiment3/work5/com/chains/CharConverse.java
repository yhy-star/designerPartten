package Experiment3.work5.com.chains;

/**
 * @ClassName： CharConverse
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 12:45
 **/
public class CharConverse extends DataFilter{

    public CharConverse(String name) {
        super(name);
    }

    @Override
    public void processRequest(Data data, String type) {
        if(type == "字符串转换"){
            System.out.println("------ 正在进行字符编码转换 ------");
            System.out.println("------ 数据名称：" + data.getName() + " ------");
        }
         else if (type == "数据全处理"){
            System.out.println("------ 正在进行字符编码转换 ------");
            System.out.println("------ 数据名称：" + data.getName() + " ------");
            if(this.successor != null){
                this.successor.processRequest(data, type);
            }
        } else {
            this.successor.processRequest(data, type);
        }
    }
}
