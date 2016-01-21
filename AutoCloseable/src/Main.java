/**
 * Created by roan on 2016/1/22.
 */
public class Main {
    public static void main(String args[]) {

        try (Resource resource = new Resource()) {
            resource.doSome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Resource implements AutoCloseable {

    public void doSome() {
        System.out.println("dododdo");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close Resource");
    }
}
