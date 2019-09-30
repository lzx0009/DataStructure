package socket;

import java.io.IOException;
import java.net.Socket;

public class client  {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",1234);
    }

}
