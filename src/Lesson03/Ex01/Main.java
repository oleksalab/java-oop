package Lesson03.Ex01;

public class Main {

    public static void main(String[] args) {

        Shape shape1;
        Shape shape2;

        shape1 = new Circle();
        shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();

        // если наследник имеет свои методы, которых нет у предка
        ((Circle) shape1).point();

        shape1 = shape2;

        shape1.draw();

    }
}
