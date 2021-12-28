package Experiment3.work12.com.stras;

/**
 * @ClassName： Scene
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:34
 **/
public class Scene {

    private String name;
    private AbstractRendering abstractRendering;

    public Scene(String name) {
        this.name = name;
    }

    public void setAbstractRendering(AbstractRendering abstractRendering) {
        this.abstractRendering = abstractRendering;
    }

    public void display(){
        System.out.println("------ 场景：" + this.name + "准备开始渲染 ------");
        abstractRendering.rendering();
    }
}
