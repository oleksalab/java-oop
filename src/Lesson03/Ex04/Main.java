package Lesson03.Ex04;

public class Main {

    public static void main(String[] args) {

        int a = 3;
        int b = 0;

        System.out.println("Начинаем программу");

        try {

            System.out.println("Делим операнды : " + a / b);

        } catch (ArithmeticException e) {

            System.out.println("Сработало исключение - Деление на ноль!");

        } finally {

            System.out.println("Программа всё ещё продолжает работать");
        }

        System.out.println("Завершение программы");

    }
}
