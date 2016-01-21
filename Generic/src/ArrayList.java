import java.util.Arrays;
import java.util.Objects;

/**
 * Created by roan on 2016/1/22.
 * http://openhome.cc/Gossip/Java/Generics.html
 */
public class ArrayList<E> {

    private Objects[] list;
    private int next;

    public ArrayList(int size) {
        list = new Objects[size];
    }

    public ArrayList() {
        this(16);
    }

    public void add(E e) {

        // Extend Array Space
        if (next == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = (Objects) e;
    }

    @SuppressWarnings("unckecked")
    public E get(int index){
        return (E) list[index];
    }

    public int size() {
        return next;
    }
}
