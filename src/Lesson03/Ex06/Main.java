package Lesson03.Ex06;

public class Main {

    public static void main(String[] args) {

        try {

            for (int i = 0; i < 10; i++) {

                System.out.println("i = " + i);

                if (i == 5) throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {

            System.out.println("Выброшено исключение");

        } finally {

            System.out.println("Финальный блок");

        }

        System.out.println("Завершение работы");

    }
}
