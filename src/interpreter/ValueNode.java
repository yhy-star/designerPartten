package interpreter;

/**
 * @ClassName： ValueNode
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/4 20:03
 **/
public class ValueNode implements Node{

    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
