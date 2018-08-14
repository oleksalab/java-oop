package Lesson02.Task01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Scanner input = new Scanner(System.in);

        System.out.println("Введите стороны прямоугольника :");

        System.out.print("Сторона A = ");
        rectangle.setSideA(input.nextDouble());

        System.out.print("Сторона B = ");
        rectangle.setSideB(input.nextDouble());

        System.out.println();

        Shape shape = rectangle;
        System.out.println("Периметр фигуры : " + shape.getPerimeter());
        System.out.println("Площадь фигуры : " + shape.getArea());

    }
}
