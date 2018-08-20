package Lesson05;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
рекурсивно просмотреть содержимое папки и её подпапок, создать индексы по типам файлов
 */
public class Ex03 {

    public static void main(String[] args) {

        // папка с файлами для анализа
        String dirPath = "D:/Temp";
        // папка для индекса (список файлов с путями)
        String dirIndex = dirPath + "/.index";

        ArrayList<String> list = new ArrayList<>();

        try {
            // формируем список всех файлов
            listAll(dirPath, list);

        } catch (IOException ioe) {

            ioe.printStackTrace();
        }

        // создаём папку для индекса
        Path path = Paths.get(dirIndex);
        if (!Files.exists(path)) {

            try {

                Files.createDirectory(path);

            } catch (IOException ioe) {

                ioe.printStackTrace();
            }
        }

        // строим индекс по файлам
        for (String line : list) {

            String[] parts = line.split(" > ");
            if (parts[0].equals("File")) {

                String filePath = parts[1];
                String fileType = filePath.substring(filePath.lastIndexOf('.') + 1);
                String indexFile = dirIndex + "/" + fileType;

                System.out.println(fileType + " > " + filePath);

                try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(indexFile, true)))) {

                    out.println(filePath);

                } catch (FileNotFoundException fnfe) {

                    //fnfe.printStackTrace();

                } catch (IOException ioe) {

                    //ioe.printStackTrace();

                }
            }
        }
    }


    // запись текстового файла
    private static void saveFile(String filePath, String text) {

        try (BufferedWriter file = new BufferedWriter(new FileWriter(filePath))) {

            file.write(text);
            file.newLine();

        } catch (IOException ioe) {

            ioe.printStackTrace();
        }
    }

    private static void listAll(String path, ArrayList<String> result) throws IOException {

        File dir = new File(path);

        File[] list = dir.listFiles();

        if (list == null) return;

        for (File item : list) {

            if (item.isFile()) {

                result.add("File > " + item.getCanonicalPath());

            } else {

                result.add("Dir > " + item.getCanonicalPath());

                listAll(item.getCanonicalPath(), result);
            }
        }
    }
}
