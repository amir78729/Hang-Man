package Network;

import core.WhatIsYourWordFrame;

import java.io.DataInputStream;
import java.io.IOException;

public class ServerMessageManager implements Runnable{
    DataInputStream reader;

    public ServerMessageManager(DataInputStream reader) {
        this.reader = reader;
    }

    @Override
    public void run() {
        try {
            while (true) {
//                System.out.println("serverM is here!");
                String from = reader.readLine();
//                System.out.println(from);
                String message = reader.readLine();
//                System.out.println(message);
                System.out.println(from + " : " + message);
                WhatIsYourWordFrame.setMyWord(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
