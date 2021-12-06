package interpreter;

/**
 * @ClassName： DivNode
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/4 20:07
 **/
public class DivNode extends SymbolNode{

    public DivNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret() / super.left.interpret();
    }
}
