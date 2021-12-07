package Experiment2.work8.com.shallowClone;

/**
 * @ClassName： Picture
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 14:53
 **/
public class Picture {
    private String pictureName;

    public String getName() {
        return pictureName;
    }

    public void setName(String pictureName) {
        this.pictureName = pictureName;
    }

    public void modifyPicture(){
        System.out.println("（浅克隆）图片为：" + this.pictureName);
    }
}
