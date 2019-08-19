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

    String name;

    public ClientHandler(Socket client, Server server) {
        this.client = client;
        this.server = server;
    }

    @Override
    public void run() {
        try {
            //be client pm mide az client pm migre mide serverManger
            fromClient = client.getInputStream();
            toClient = client.getOutputStream();
            reader = new DataInputStream(fromClient);
            writer = new PrintWriter(toClient,true);

            writer.println("Server is talking!what is your name?");
            name =  reader.readLine();
            System.out.println(name + " is connected!");
            server.addToClients(name, this);
            while (true){
                String user = reader.readLine();
                String message = reader.readLine();

                sendMessageTo(user, message);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void sendMessageTo(String user, String message){
        ClientHandler anotherClient = server.findClient(user);
        if(anotherClient == null) {
//            System.out.println("chera null?");
            return;
        }
        else
            anotherClient.sendText(name,message);
    }

    public void sendText(String from,String massege){
        writer.println(from);
//        System.out.println(from + "in clientH sendText");
        writer.println(massege);
//        System.out.println(massege+" in clientH sendText");
    }

}
