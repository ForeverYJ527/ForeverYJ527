package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;

    public Client() {
        try {
            System.out.println("正在连接服务端...");
            socket = new Socket("localhost", 8088);
            System.out.println("与服务端建立连接了");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);

            Scanner input = new Scanner(System.in);
            while (true) {
                String line = input.nextLine();
                if ("exit".equalsIgnoreCase(line))
                    break;
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

}

