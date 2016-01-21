/**
 * Created by roan on 2016/1/22.
 * http://openhome.cc/Gossip/Java/AnonymousInnerClass.html
 */

public class Anonymous {
    public static void main(String args[]) {
        Client c1 = new Client("10.0.0.1", "peter");
        Client c2 = new Client("8.8.8.8", "google");
        ClientQueue queue = new ClientQueue();

        queue.addClientListener(new ClientListener() {
            @Override
            public void ClientAdd(ClientEvent event) {
                System.out.printf("%s From %s Connected%n", event.getName(), event.getIP());
            }

            @Override
            public void ClientRemove(ClientEvent event) {
                System.out.printf("%s From %s Disconnected%n", event.getName(), event.getIP());
            }
        });

        queue.add(c1);
        queue.add(c2);
        queue.remove(c1);
    }
}
