package Lesson02.Task03;

import Lesson02.Task02.Point;
import Lesson02.Task01.Shape;

public class Polygon extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Point e;

    public void setA(Point a) { this.a = a; }

    public void setB(Point b) { this.b = b; }

    public void setC(Point c) { this.c = c; }

    public void setD(Point d) { this.d = d; }

    public void setE(Point e) { this.e = e; }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "Polygon {" + " a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e + " }";
    }
}
