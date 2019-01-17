/**
 * Created by sunmood on 2019/1/17.
 * 部门类：抽象访问者类
 */
public abstract class Department {
    public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}
