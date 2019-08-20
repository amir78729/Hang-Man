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
            //client be cHandler pm mide vali pm haye daryaft shode tu serverManger chap mishan chon inja sakhte mishan
            new Thread(new ServerMessageManager(reader)).start();
//           while (true)
//               sendChat();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void sendChat(String another, String message) throws IOException {
        System.out.println("who do u want to talk to?");
        //Scanner sc = new Scanner(System.in);
        writer.println(another);
        System.out.println("Whats your message?");
        writer.println(message);
    }

//    public static void main(String[] args) {
//        new Client();
//    }

}
