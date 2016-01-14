import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Phil Huang (pichuang@cs.nctu.edu.tw) on 2016/1/5.
 */
public class StringQueueTest {

    private StringQueue test = new StringQueue();

    @Test
    public void testPut() throws Exception {
        test.put("a");
        Assert.assertEquals("a", test.get());
    }

    @Test
    public void testGet() throws Exception {
        test.put("c");
        test.put("d");
        Assert.assertEquals("c", test.get());
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertTrue(test.isEmpty());
    }
}