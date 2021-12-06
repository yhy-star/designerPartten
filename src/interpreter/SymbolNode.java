package interpreter;

/**
 * @ClassName： SymbolNode
 * @Description：
 * @Author: yhy
 * @Date： 2021/12/4 20:04
 **/
public abstract class SymbolNode implements Node{

    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

}
