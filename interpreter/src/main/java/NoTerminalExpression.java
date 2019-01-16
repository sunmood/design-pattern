/**
 * Created by sunmood on 2019/1/14.
 * 包含两个操作元素的非终结符表达式类
 */
public class NoTerminalExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public NoTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 递归调用每一个组成部分的interpret()方法
     * 在递归调用时指定组成部分的连接方式，即非终结符的功能
     * @param ctx
     */
    public void interpret(Context ctx) {

    }
}
