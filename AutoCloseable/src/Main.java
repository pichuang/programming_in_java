/**
 * Created by roan on 2016/1/22.
 */
public class Main {
    public static void main(String args[]) {

        try (Resource resource = new Resource(); OtherResource oresource = new OtherResource()) {
            resource.doSome();
            oresource.doSome();
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

class OtherResource extends Resource implements AutoCloseable {
    public void doSome() {
        System.out.println("xxxxx");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close Other Resource");
    }
}
