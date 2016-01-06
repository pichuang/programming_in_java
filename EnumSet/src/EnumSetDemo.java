
import java.util.EnumSet;

/**
 * Created by Phil Huang (pichuang@cs.nctu.edu.tw) on 2016/1/6.
 */
public class EnumSetDemo {
    private EnumSet<FontConstant> enumset;

    public EnumSetDemo() {
        enumset = EnumSet.of(FontConstant.Plain, FontConstant.Bold);
    }

    public void print() {
        for (FontConstant constant : enumset) {
            System.out.print(constant + " ");
        }
        System.out.println();
    }
}
