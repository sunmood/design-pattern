/**
 * Created by sunmood on 2019/1/14.
 */
public class ConcreteAggregate implements Aggregate {
    public Iterator createIterator(){
        return new ConcreteIterator(this);
    }
}
