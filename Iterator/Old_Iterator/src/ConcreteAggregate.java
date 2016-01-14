/**
 * Created by roan on 2016/1/13.
 */

public class ConcreteAggregate implements Aggregate {

    private Object[] collection;
    private int last = 0;

    public ConcreteAggregate() {
        collection = new Object[3];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    public Object get(int index){
        return collection[index];
    }

    public void append(Object item){
        this.collection[last] = item;
        last++;
    }

    public int getLength(){
        return last;
    }

}
