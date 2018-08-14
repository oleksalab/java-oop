package Lesson02.Task03;

import Lesson02.Task02.Point;
import Lesson02.Task01.Shape;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {

        double ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        double bc = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        double ca = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));

        return Math.abs(ab + bc + ca);
    }

    @Override
    public double getArea() {

        double result = ((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2;

        return Math.abs(result);
    }

    @Override
    public String toString() {
        return "Triangle {" + " a = " + a + ", b = " + b + ", c = " + c + " }";
    }
}
