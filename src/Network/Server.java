package Network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    private ServerSocket serverSocket;
    private Socket client;
    int port = 5000;
    private HashMap<String, ClientHandler> clients;

    public Server(){
        try {
            serverSocket = new ServerSocket(port);
            clients = new HashMap<String, ClientHandler>();
            System.out.println("Server Created!");
            while(true){
                client = serverSocket.accept();
                //pm haye client be server inja chap mishan chon starte handler injas
                new Thread(new ClientHandler(client,this)).start();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void addToClients(String username, ClientHandler clientHandler){
        clients.put(username, clientHandler);
    }
    public ClientHandler findClient(String username){
        return clients.get(username);
    }

    public static void main(String[] args) {
        new Server();
    }

}

