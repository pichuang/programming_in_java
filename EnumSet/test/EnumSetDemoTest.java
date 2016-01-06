import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Phil Huang (pichuang@cs.nctu.edu.tw) on 2016/1/6.
 */
public class EnumSetDemoTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUP() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testPrint() throws Exception {
        EnumSetDemo test = new EnumSetDemo();
        test.print();
        Assert.assertEquals("Plain Bold \n", outContent.toString());
    }
}