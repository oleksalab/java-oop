package Lesson05.Task02;

import java.io.*;

/*
объединить два текстовых файла в один
 */
public class Main {

    public static void main(String[] args) {

        String resultFile = "D:/Temp/result.txt";

        // исходный набор файлов
        String[] files = {
                "D:/Temp/file1.txt",
                "D:/Temp/file2.txt"
        };

        // читаем файлы и склеиваем их
        String text = "";
        for (String file : files) {

            text += readFile(file);
        }

        // сохраняем итоговый файл
        saveFile(resultFile, text);
    }

    // запись текстового файла
    private static void saveFile(String resultFile, String text) {

        try (BufferedWriter f = new BufferedWriter(new FileWriter(resultFile))) {

            f.write(text);
            f.newLine();

        } catch (IOException ioe) {

            ioe.printStackTrace();
        }
    }

    // чтение текстового файла
    private static String readFile(String filePath) {

        StringBuilder text = new StringBuilder();

        try (BufferedReader file = new BufferedReader(new FileReader(filePath))) {

            String line = "";
            while ((line = file.readLine()) != null) {

                text.append(line);
                text.append(System.lineSeparator());
            }

        } catch (IOException ioe) {

            ioe.printStackTrace();
        }

        return text.toString();
    }
}
