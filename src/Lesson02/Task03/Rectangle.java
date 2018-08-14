package Lesson02.Task03;

import Lesson02.Task02.Point;
import Lesson02.Task01.Shape;

public class Rectangle extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public double getPerimeter() {

        double ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        double bc = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        double cd = Math.sqrt(Math.pow(c.getX() - d.getX(), 2) + Math.pow(c.getY() - d.getY(), 2));
        double da = Math.sqrt(Math.pow(d.getX() - a.getX(), 2) + Math.pow(d.getY() - a.getY(), 2));

        return Math.abs(ab + bc + cd + da);
    }

    @Override
    public double getArea() {

        double ab = (a.getX() - b.getX()) * (a.getY() - b.getY());
        double bc = (b.getX() - c.getX()) * (b.getY() - c.getY());
        double cd = (c.getX() - d.getX()) * (c.getY() - d.getY());
        double da = (d.getX() - a.getX()) * (d.getY() - a.getY());

        return Math.abs(ab + bc + cd + da) / 2;
    }

    @Override
    public String toString() {
        return "Rectangle { " + "a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + " }";
    }
}
