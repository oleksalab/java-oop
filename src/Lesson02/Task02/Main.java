package Lesson02.Task02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Point point = new Point();
        Scanner input = new Scanner(System.in);

        System.out.println("Введите данные о точке :");

        System.out.print("X = ");
        point.setX(input.nextDouble());

        System.out.print("Y = ");
        point.setY(input.nextDouble());

        System.out.println();

        System.out.println(point);
    }

}
