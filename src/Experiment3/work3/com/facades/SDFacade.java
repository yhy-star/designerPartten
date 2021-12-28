package Experiment3.work3.com.facades;

import Experiment3.work3.com.funs.AddressCopy;
import Experiment3.work3.com.funs.MessageCopy;
import Experiment3.work3.com.funs.PictureCopy;
import Experiment3.work3.com.funs.SoundCopy;

/**
 * @ClassName： SDFacade
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 9:15
 **/
public class SDFacade extends AbstractFacade{

    private AddressCopy addressCopy;
    private MessageCopy messageCopy;
    private PictureCopy pictureCopy;
    private SoundCopy soundCopy;
    private String name;

    public SDFacade() {
        System.out.println("——————以SD的方式进行复制——————");
        this.addressCopy = new AddressCopy();
        this.messageCopy = new MessageCopy();
        this.pictureCopy = new PictureCopy();
        this.soundCopy = new SoundCopy();
        this.name = "SD";
    }

    @Override
    public void copy() {
        addressCopy.copy(this.name);
        messageCopy.copy(this.name);
        pictureCopy.copy(this.name);
        soundCopy.copy(this.name);
    }
}
