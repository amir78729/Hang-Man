package Network;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable{
    Socket client;
    Server server;
    InputStream fromClient;
    OutputStream toClient;

    DataInputStream reader;
    PrintWriter writer;

    public ClientHandler(Socket client, Server server) {
        this.client = client;
        this.server = server;
    }

    @Override
    public void run() {
        try {
            fromClient = client.getInputStream();
            toClient = client.getOutputStream();
            reader = new DataInputStream(fromClient);
            writer = new PrintWriter(toClient,true);

            writer.println("Server is talking!what is your name?");
            String name =  reader.readLine();
            System.out.println(name + " is connected!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
