package Lesson11.Ex02;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        String hostname = "http://user@www.ukr.net:80";

        try {

            URL url = new URL(hostname);

            System.out.println("Структура URL :");
            System.out.println("Protocol\t: " + url.getProtocol());
            System.out.println("Hostname\t: " + url.getHost());
            System.out.println("SrvPort\t: "  + url.getPort());
            System.out.println("UserInfo\t: " + url.getUserInfo());

            System.out.println("\nСодержимое ответа :");
            System.out.println("Content\t: "  + url.getContent());

        } catch (MalformedURLException mue) {

            mue.printStackTrace();

        } catch (IOException ioe) {

            ioe.printStackTrace();
        }

    }
}
