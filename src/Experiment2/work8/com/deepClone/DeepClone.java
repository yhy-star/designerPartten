package Experiment2.work8.com.deepClone;

import java.io.*;

/**
 * @ClassName： DeepClone
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/7 14:38
 **/
public class DeepClone implements Serializable {

    private String name;
    private String department;
    private PictureDeep picture;

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

    public PictureDeep getPicture() {
        return picture;
    }

    public void setPicture(PictureDeep picture) {
        this.picture = picture;
    }

    public DeepClone deepClone() throws IOException, ClassNotFoundException, OptionalDataException{

        // 将对象写入流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(this);

        // 将对象从流中取出
        ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
        return (DeepClone) inputStream1.readObject();
    }
}
