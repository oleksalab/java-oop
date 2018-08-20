package Lesson05.Task01;

import java.io.*;

/*
скопировать файлы заданного типа из одной папки в другую
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String fileType = "doc";
        String srcPath = "D:/Temp/src/";
        String dstPath = "D:/Temp/dst/";

        File srcDir = new File(srcPath);

        // список файлов из исходной папки согласно фильтра
        File[] files = srcDir.listFiles(new FilenameFilter() {

            public boolean accept(File dir, String name) {

                return name.toLowerCase().endsWith(fileType);
            }
        });

        // копируем отобранные файлы в папку назначения
        for (File file : files) {

            System.out.println("File : " + file.getName());
            fileCopy(file, dstPath);
        }
    }

    // копирование файла с помощью потоков
    private static void fileCopy(File file, String dir) throws IOException {

        String dstPath = dir + "/" + file.getName();
        File dstFile = new File(dstPath);

        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(dstFile);

        int bufSize;
        byte[] buffer = new byte[1024];
        while ((bufSize = fileInputStream.read(buffer)) > 0) {

            fileOutputStream.write(buffer, 0, bufSize);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

}
