package Lesson02.Task01;

public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public void setSideA(double sideA) {

        this.sideA = sideA;
    }

    public void setSideB(double sideB) {

        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getPerimeter() {

        return sideA + sideB;
    }

    @Override
    public double getArea() {

        return sideA * sideB;
    }
}
