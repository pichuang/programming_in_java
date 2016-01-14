/**
 * Created by roan on 2016/1/13.
 */
public class ConcreteIterator implements Iterator {
    private int index;
    private ConcreteAggregate nameCollection;

    public ConcreteIterator(ConcreteAggregate collection) {
        this.nameCollection = collection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < nameCollection.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Object item = nameCollection.get(index);
        index++;
        return item;
    }
}
