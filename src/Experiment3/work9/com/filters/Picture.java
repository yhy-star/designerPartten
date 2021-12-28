package Experiment3.work9.com.filters;

/**
 * @ClassName： Picture
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 18:48
 **/
public class Picture {

    private String name;
    private Filter filter;

    public Picture() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void display(){
        System.out.println("------ 图片：" + this.name + "开始P图 ------");
        filter.filterPro();
    }
}
