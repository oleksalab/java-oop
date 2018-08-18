package Lesson05;

import java.io.*;

public class Ex01 {

    public static void main(String[] args) throws IOException {

        String str = "Hello world";
        byte[] mas = str.getBytes();

        InputStream b = new ByteArrayInputStream(mas);

        int c = 0;
        for (; ; ) {

            if (c == -1) break;

            c = b.read();
            System.out.println((char) c + "   " + c);
        }
    }
}
