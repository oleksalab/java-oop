package Lesson03.Ex03;

public class Main {

    public static void main(String[] args) {

        Shape shape1 = new Shape();
        Circle shape2 = new Circle();

        System.out.println((shape1 instanceof Circle));

        System.out.println((shape2 instanceof Shape));

    }
}
