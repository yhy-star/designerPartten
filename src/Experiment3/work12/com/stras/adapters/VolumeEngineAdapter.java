package Experiment3.work12.com.stras.adapters;

import Experiment3.work12.com.stras.AbstractRendering;

/**
 * @ClassName： VolumeEngineAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:32
 **/
public class VolumeEngineAdapter implements AbstractRendering {

    private VolumeEngine volumeEngine = new VolumeEngine();

    @Override
    public void rendering() {
        volumeEngine.rendering();
    }
}
