package Lesson11.Ex04;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        Group group = new Group("JAVA12");
        group.addStudent(new Student("Иван", "Иванов", 3));
        group.addStudent(new Student("Петр", "Петров", 4));
        group.addStudent(new Student("Сидор", "Сидоров", 5));
        group.addStudent(new Student("Гарбуз", "Гарбузов", 1));

        String result = "<html>";

        // заголовок таблицы
        result += "<head><title>Student</title>"
                + "<meta charset='utf-8'></head>"
                + "<body><p>Список студентов группы: "
                + "<b>" + group.getName() + "</b>"
                + "</p>";

        // строки таблицы
        result += "<table border='2' cellpadding='5' >"
                + "<tr><th>Фамилия</th><th>Имя</th><th>Курс</th></tr>";

        Student[] list = group.getGroup();

        for (int i = 0; i < list.length; i++) {
            result += "<tr>";
            result += "<td>" + list[i].getLastname() + "</td>";
            result += "<td>" + list[i].getName() + "</td>";
            result += "<td>" + list[i].getCourse() + "</td>";
            result += "</tr>";
        }

        // закрываем таблицу
        result += "</table></body></html>";

        try (ServerSocket serverSocket = new ServerSocket(8080)) {

            System.out.println("Http-Сервер");

            for (; ; ) {
                Socket clientSocket = serverSocket.accept();
                new Client(clientSocket, result);
            }

        } catch (IOException ioe) {

            System.out.println("Ошибка при открытии сокета для сервера!");
        }
    }
}
