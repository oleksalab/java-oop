package Lesson08.Ex03;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String fileStream = "serial";

        Group PN121 = new Group();
        PN121.addHuman("Alexander", 21, 'м');
        PN121.addHuman("Alexey", 18, 'м');
        PN121.addHuman("Katia", 18, 'ж');

        System.out.println();
        System.out.println("Вывод данных исходного объекта");
        System.out.println();

        PN121.printgroup();

        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(fileStream))) {

            OOS.writeObject(PN121);

        } catch (IOException e) {

            System.out.println("ERROR save group !!!");
        }

        Group KT321 = null;

        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(fileStream))) {

            KT321 = (Group) OIS.readObject();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("ERROR load group !!!");
        }

        System.out.println();
        System.out.println("Вывод данных считанного объекта");
        System.out.println();

        KT321.printgroup();
    }
}
