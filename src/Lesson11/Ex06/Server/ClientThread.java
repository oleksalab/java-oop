package Lesson11.Ex06.Server;

import Lesson11.Ex06.Client.Message;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

public class ClientThread extends Thread {

    private Socket socket;
    private List<Message> messages;
    private int temp = 0;

    public ClientThread(Socket socket, List<Message> messages) {
        this.socket = socket;
        this.messages = messages;
    }

    private void listToByte(OutputStream outputStream) throws IOException {

        for (int i = temp; i < messages.size(); i++) {

            messages.get(i).writeToStream(outputStream);
        }

        temp = messages.size();
    }

    @Override
    public void run() {

        try {

            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();

            while (!isInterrupted()) {

                if (temp < messages.size()) {

                    listToByte(outputStream);
                }

                Message message = Message.readFromStream(inputStream);

                if (message != null) {

                    messages.add(message);
                }
            }

        } catch (IOException e) {

            return;
        }

    }
}
