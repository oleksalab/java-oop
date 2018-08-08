package Lesson03.Ex01;

public class Circle extends Shape {

    @Override
    public void draw() {
        //super.draw();
        System.out.println("Рисуем круг");
    }

    public void point() {

        System.out.println("Ставим точку");
    }
}
