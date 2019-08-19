package Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    private ServerSocket serverSocket;
    private Socket client;
    int port = 5000;
    private HashMap<Client, Socket> clients;

    public Server(){
        try {
            serverSocket = new ServerSocket(port);
            clients = new HashMap<Client, Socket>();
            System.out.println("Server Created!");
            while(true){
                client = serverSocket.accept();
                System.out.println("New Client Connected!");
                new Thread(new ClientHandler(client,this)).start();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Server();
    }

}

