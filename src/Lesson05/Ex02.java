package Lesson05;

import java.io.*;

public class Ex02 {

    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream b = new ByteArrayOutputStream();

        byte[] buf = {'a'};

        try {

            // разные варианты передачи данных в поток
            b.write(buf);

            b.write('b');

            String str = "HELLO";
            b.write(str.getBytes());

        } catch (IOException e) {

            System.out.println("Error");
        }

        byte[] c = b.toByteArray();
        for (int i = 0; i < c.length; i++) {

            System.out.print((char) c[i]);
        }

        b.close();

    }
}
