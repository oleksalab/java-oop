package Lesson11.Ex06.Client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("localhost", 8085);
            final InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            System.out.print("Enter login: ");
            String login = scanner.nextLine();

            Thread thread = new Thread() {
                @Override
                public void run() {

                    try {
                        while (!isInterrupted()) {
                            Message message = Message.readFromStream(inputStream);
                            if (message == null)
                                Thread.yield();
                            else
                                System.out.println(message.toString());
                        }
                    } catch (Exception e) {
                        System.out.println(e.toString());
                        return;
                    }
                }
            };
            thread.setDaemon(true);
            thread.start();

            try {
                while (true) {
                    String s = scanner.nextLine();
                    if (s.isEmpty()) break;

                    int i = s.indexOf(':');
                    String to = "";
                    String text = s;

                    if (i >= 0) {
                        to = s.substring(0, i);
                        text = s.substring(i + 1);
                    }

                    Message message = new Message();
                    message.text = text;
                    message.from = login;

                    message.writeToStream(outputStream);
                }

            } finally {
                thread.interrupt();
                socket.close();
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
