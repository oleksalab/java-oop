package Lesson11.Ex03;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) {

        String link = "https://spring.io/guides/gs/rest-service/";

        try {

            URL url = new URL(link);
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            int i;
            for (; (i = inputStream.read()) != -1; ) {

                System.out.print((char) i);
            }

        } catch (MalformedURLException mue) {

            mue.printStackTrace();

        } catch (IOException ioe) {

            ioe.printStackTrace();
        }

    }
}
