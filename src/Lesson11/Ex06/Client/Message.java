package Lesson11.Ex06.Client;

import java.io.*;
import java.util.Date;

public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date date = new Date();

    public String from;
    public String to;
    public transient String text;

    public boolean isFile;
    public String path;

    public static Message readFromStream(InputStream input) throws IOException {

        if (input.available() <= 0) return null;

        DataInputStream dataStream = new DataInputStream(input);

        byte[] packet = new byte[dataStream.readInt()];
        dataStream.read(packet);

        ByteArrayInputStream byteStream = new ByteArrayInputStream(packet);
        ObjectInputStream objectStream = new ObjectInputStream(byteStream);

        try {

            Message message = (Message) objectStream.readObject();

            if (!message.isFile) {

                message.text = (String) objectStream.readUTF();

            } else {

                // получить содержимое файла и создать его на основе path
            }

            return message;

        } catch (ClassNotFoundException cnfe) {

            cnfe.printStackTrace();
        }

        return null;
    }

    public void writeToStream(OutputStream output) throws IOException {

        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ObjectOutputStream objectStream = new ObjectOutputStream(byteStream);

        try {

            objectStream.writeObject(this);

            if (!isFile) {

                objectStream.writeUTF(text);

            } else {

                // TODO: открыть файл, прочитать и положить содержимое в text и затем сериализовать
            }

        } finally {

            objectStream.flush();
            objectStream.close();
        }

        byte[] packet = byteStream.toByteArray();

        DataOutputStream dataStream = new DataOutputStream(output);
        dataStream.writeInt(packet.length);
        dataStream.write(packet);
        dataStream.flush();
    }

    @Override
    public String toString() {

        return new StringBuilder()
                .append("[")
                .append(date.toString())
                .append("From : ")
                .append(from)
                .append(", To : ")
                .append(to)
                .append("]\nText : ")
                .append(text)
                .toString();
    }
}
