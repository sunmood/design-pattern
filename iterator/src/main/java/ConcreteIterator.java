/**
 * Created by sunmood on 2019/1/14.
 * 具体迭代器类
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate concreteAggregate;//维持一个对具体聚合对象的引用，以便访问存储在聚合对象中的数据
    private int cursor;//定义一个游标，用于记录当前访问位置

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    public void first() {

    }

    public void next() {

    }

    public boolean hasNext() {
        return false;
    }

    public Object currentItem() {
        return null;
    }
}
