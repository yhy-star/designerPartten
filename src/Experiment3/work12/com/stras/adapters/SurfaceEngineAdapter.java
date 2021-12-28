package Experiment3.work12.com.stras.adapters;

import Experiment3.work12.com.stras.AbstractRendering;

/**
 * @ClassName： SurfaceEngineAdapter
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/28 20:32
 **/
public class SurfaceEngineAdapter implements AbstractRendering {

    private SurfaceEngine surfaceEngine = new SurfaceEngine();

    @Override
    public void rendering() {
        surfaceEngine.rendering();
    }
}
