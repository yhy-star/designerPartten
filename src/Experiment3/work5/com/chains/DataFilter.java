package Experiment3.work5.com.chains;

/**
 * @ClassName： DataFilter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 12:42
 **/
public abstract class DataFilter {

    protected String name;            //  类自己的名字
    protected DataFilter successor;   //  下一位的名称

    public DataFilter(String name) {
        this.name = name;
    }

    public void setSuccessor(DataFilter successor) {
        this.successor = successor;
    }

    public abstract void processRequest(Data data, String type);
}
