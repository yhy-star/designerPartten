package Experiment2.work8.com.deepClone;

import java.io.Serializable;

/**
 * @ClassName： PictureDeep
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 15:00
 **/
public class PictureDeep implements Serializable {
    private String pictureName;

    public String getName() {
        return pictureName;
    }

    public void setName(String pictureName) {
        this.pictureName = pictureName;
    }

    public void modifyPicture(){
        System.out.println("（深克隆）图片为：" + this.pictureName);
    }
}
