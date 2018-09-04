package Lesson11.Ex01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {

        String hostname = "www.ukr.net";

        System.out.println("Hostname\t: " + hostname);

        try {

            InetAddress inetAddress = InetAddress.getByName(hostname);

            System.out.println("IP Address\t: " + inetAddress.getHostAddress());

        } catch (UnknownHostException uhe) {

            uhe.printStackTrace();
        }


    }
}
