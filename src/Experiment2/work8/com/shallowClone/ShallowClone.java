package Experiment2.work8.com.shallowClone;

/**
 * @ClassName： ShallowClone
 * @Description：浅克隆，用户选择否，复制出来的新的对象与原对象使用共同的成员对象
 * @Author: yhy
 * @Date： 2021/12/7 14:39
 **/
public class ShallowClone implements Cloneable{

    private String name;
    private String department;
    private Picture picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public ShallowClone clone(){
        Object obj = null;
        try {
            obj = super.clone();
            return (ShallowClone) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }
}
