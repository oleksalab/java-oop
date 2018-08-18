package Lesson05;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Ex03 {

    public static void main(String[] args) throws IOException {

        String path = "src";
        path = "C:/Program Files/";

        ArrayList<String> result = new ArrayList<>();

        listAll(path, result);

        for (String line : result) {

            System.out.println(line);
        }
    }

    /*
    TODO: разложить согласно форматов пути к файлам по файлам с названием этого формата
     */
    private static void listAll(String path, ArrayList<String> result) throws IOException {

        File dir = new File(path);

        File[] list = dir.listFiles();

        if (list == null) return;

        for (File item : list) {

            if (item.isFile()) {

                result.add("File : " + item.getCanonicalPath());

            } else {

                result.add("Dir : " + item.getCanonicalPath());

                listAll(item.getCanonicalPath(), result);
            }
        }
    }
}
