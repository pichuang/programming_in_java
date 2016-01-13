import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by roan on 2016/1/13.
 */
public class ConcreteAggregateTest {

    private ConcreteAggregate collection = new ConcreteAggregate();
    Iterator it = collection.iterator();

    @Test
    public void testIterator() throws Exception {
        collection.append("gg");
        collection.append("yy");
        while (it.hasNext()) {
            String test = (String) it.next();
//            System.out.print(test);
        }
    }

    @Test
    public void testAppend() throws Exception {
        collection.append("gg");
        Assert.assertEquals("gg", collection.get(0));
        collection.append("yy");
        Assert.assertEquals("yy", collection.get(1));
    }

    @Test
    public void testGetLength() throws Exception {
        collection.append("gg");
        collection.append("yy");
        Assert.assertEquals(2, collection.getLength());
    }
}