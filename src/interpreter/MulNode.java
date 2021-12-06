package interpreter;

/**
 * @ClassName： MulNode
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/4 20:05
 **/
public class MulNode extends SymbolNode{

    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret() * super.right.interpret();
    }
}
