import java.util.Iterator;
import java.util.Vector;

/**
 * Created by roan on 2016/1/14.
 */
public class IteratorExample {
    public static void main(String args[]) {
        Vector collection = new Vector(3);
        collection.add(new Person("Davis"));
        collection.add(new Person("Frank"));
        collection.add(new Person("Jeny"));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Person person = (Person) it.next();
            System.out.println(person.getName());
        }
    }
}
