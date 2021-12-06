package interpreter;

/**
 * @ClassName： ModNode
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/4 20:08
 **/
public class ModNode extends SymbolNode{

    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret() % super.right.interpret();
    }
}
