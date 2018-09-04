package Lesson11.Ex04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {

    private Socket socket;
    private String response;

    public Client(Socket socket, String response) {
        super();

        this.socket = socket;
        this.response = response;

        new Thread(this).start();
    }

    public void run() {

        String result;

        try (InputStream inputStream = socket.getInputStream();
             OutputStream outputStream = socket.getOutputStream();
             PrintWriter printWriter = new PrintWriter(outputStream)) {

            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);

            result = "HTTP/1.1 200 OK\r\n"
                    + "Server: My_Server\r\n"
                    + "Content-Type: text/html\r\n"
                    + "Content-Length: " + "\r\n"
                    + "Connection: close\r\n\r\n";

            printWriter.print(result + response);
            printWriter.flush();

        } catch (IOException e) {

            System.out.println(e.toString());
        }
    }
}
