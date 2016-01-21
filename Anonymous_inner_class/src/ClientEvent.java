/**
 * Created by roan on 2016/1/22.
 */
public class ClientEvent {
    private Client client;

    public ClientEvent(Client client) {
        this.client = client;
    }

    public String getName() {
        return client.name;
    }

    public String getIP() {
        return client.ip;
    }
}
