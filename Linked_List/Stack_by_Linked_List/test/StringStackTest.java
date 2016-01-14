import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Phil Huang (pichuang@cs.nctu.edu.tw) on 2016/1/5.
 */
public class StringStackTest {

    private StringStack test = new StringStack();

    @Before
    public void setUp() {
    }

    @Test
    public void testPush() throws Exception {
        test.push("c");
        Assert.assertEquals("c", test.top());
    }

    @Test
    public void testPop() throws Exception {
        test.push("a");
        test.push("b");
        test.pop();
        Assert.assertEquals("a", test.top());
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertTrue(test.isEmpty());
    }
}