package Lesson01.Task02;

/*
класс для вычисления площади треугольника по трём сторонам
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // вариант #1
        Triangle abc1 = new Triangle();
        abc1.setSideA(3);
        abc1.setSideB(4);
        abc1.setSideC(5);

        System.out.println("Площадь треугольника #1 = " + String.format("%.3f", abc1.calcArea()));

        // вариант #2
        Triangle abc2 = new Triangle(22,31,42);
        double area = abc2.calcArea();
        System.out.println("Площадь треугольника #2 = " + String.format("%.3f", area));

        // вариант #3
        System.out.println("Введите стороны треугольника :");

        Scanner input = new Scanner(System.in);

        System.out.print("Сторона А = ");
        int sideA = input.nextInt();

        System.out.print("Сторона B = ");
        int sideB = input.nextInt();

        System.out.print("Сторона C = ");
        int sideC = input.nextInt();

        Triangle abc3 = new Triangle(sideA, sideB, sideC);
        System.out.println("Площадь треугольника = " + String.format("%.3f", abc3.calcArea()));
    }
}
