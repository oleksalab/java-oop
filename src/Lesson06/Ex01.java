package Lesson06;

public class Ex01 {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        System.out.println("Название потока : " + thread.getName());

        System.out.println("Начинаем паузу");

        try {

            thread.sleep(3000);

            System.out.println("Пауза завершена");

        } catch (InterruptedException e) {

            System.out.println("Основной поток прерван");
        }

        System.out.println("Программа завершена");

    }
}
