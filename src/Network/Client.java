package Network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    Socket socket;
    int port = 5000;
    String serverAddress = "127.0.0.1";

    InputStream fromServer;
    OutputStream toServer;
    DataInputStream reader;
    PrintWriter writer;

    public Client() {
        try {
            socket = new Socket(serverAddress,port);
            System.out.println("connecting to server...");

            fromServer = socket.getInputStream();
            toServer = socket.getOutputStream();

            reader = new DataInputStream(fromServer);
            writer = new PrintWriter(toServer,true);

            String msg = reader.readLine();
            System.out.println("Server: " + msg);
            Scanner sc = new Scanner(System.in);
            writer.println(sc.nextLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client();
    }

}
