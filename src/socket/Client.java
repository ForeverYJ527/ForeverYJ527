package socket;

import java.io.IOException;
import java.net.Socket;

public class Client {
    private Socket socket;

    public Client() {
        try {
            socket = new Socket("", 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {

    }

}

