import java.util.LinkedList;

/**
 * Created by Phil Huang (pichuang@cs.nctu.edu.tw) on 2016/1/5.
 */
public class StringQueue implements Queue {
    private LinkedList<String> queue;

    public StringQueue() {
        queue = new LinkedList<String>();
    }

    @Override
    public void put(String str) {
        queue.addFirst(str);
    }

    @Override
    public String get() {
        return queue.removeLast();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void print() {
        System.out.println(queue);
    }
}
