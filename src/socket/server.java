package socket;

import java.io.IOException;
import java.net.ServerSocket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
    }
}
