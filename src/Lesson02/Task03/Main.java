package Lesson02.Task03;

import Lesson02.Task01.Shape;
import Lesson02.Task02.Point;

public class Main {

    public static void main(String[] args) {

        System.out.println("Геометрические фигуры :\n");

        Triangle triangle = new Triangle();
        triangle.setA(new Point(1, 1));
        triangle.setB(new Point(2, 5));
        triangle.setC(new Point(5, 3));

        Shape shape1 = triangle;

        System.out.println("Фигура 'Треугольник' :\n" + shape1);
        System.out.println("Периметр фигуры : " + String.format("%.2f", shape1.getPerimeter()));
        System.out.println("Площадь фигуры : " + String.format("%.2f", shape1.getArea()));

        System.out.println();

        Rectangle rectangle = new Rectangle();
        rectangle.setA(new Point(2,6));
        rectangle.setB(new Point(8,2));
        rectangle.setC(new Point(8,5));
        rectangle.setD(new Point(2,9));

        Shape shape2 = rectangle;

        System.out.println("Фигура 'Прямоугольник' :\n" + shape2);
        System.out.println("Периметр фигуры : " + String.format("%.2f", shape2.getPerimeter()));
        System.out.println("Площадь фигуры : " + String.format("%.2f", shape2.getArea())); // 18

        System.out.println();

        Polygon polygon = new Polygon();
        polygon.setA(new Point(1,1));
        polygon.setB(new Point(2,2));
        polygon.setC(new Point(3,3));
        polygon.setD(new Point(4,4));
        polygon.setE(new Point(5,5));

        Shape shape3 = polygon;

        System.out.println("Фигура 'Многоугольник' :\n" + shape3);
        System.out.println("Периметр фигуры : " + String.format("%.2f", shape3.getPerimeter()));
        System.out.println("Площадь фигуры : " + String.format("%.2f", shape3.getArea()));

    }
}
