package Experiment3.work5;

import Experiment3.work5.com.chains.*;

/**
 * @ClassName： Client
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 12:33
 **/
public class Client {
    public static void main(String[] args) {
        DataFilter charCon, dataCon, dataVal;
        charCon = new CharConverse("字符编码");
        dataCon = new DataConverse("数据转型");
        dataVal = new DataValidate("数据校验");

        charCon.setSuccessor(dataCon);
        dataCon.setSuccessor(dataVal);

        Data data = new Data("Java");
        String type = "数据全处理";

        charCon.processRequest(data, type);
    }
}
