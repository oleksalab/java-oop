package Lesson01.Task02;

public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public void setSideB(int sideB) { this.sideB = sideB; }
    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public int getSideC() {
        return sideC;
    }

    private double getSemiPerimeter() {

        return (sideA + sideB + sideC) / 2;
    }

    public double calcArea() {

        double semiPerimeter = getSemiPerimeter();

        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
}
