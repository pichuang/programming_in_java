import java.util.ArrayList;

/**
 * Created by roan on 2016/1/22.
 */
public class ClientQueue {
    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<ClientListener> listeners = new ArrayList<ClientListener>();

    public void addClientListener(ClientListener listener) {
        listeners.add(listener);
    }

    public void add(Client client) {
        clients.add(client);
        ClientEvent event = new ClientEvent(client);
        for (int i = 0; i < listeners.size(); i++) {
            ClientListener listener = listeners.get(i);
            listener.ClientAdd(event);
        }
    }

    public void remove(Client client) {
        clients.remove(client);
        ClientEvent event = new ClientEvent(client);
        for (int i = 0; i < listeners.size(); i++) {
            ClientListener listener = listeners.remove(i);
            listener.ClientRemove(event);
        }
    }
}
