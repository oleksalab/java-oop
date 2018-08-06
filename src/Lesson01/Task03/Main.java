package Lesson01.Task03;

/*
класс с реализацией операций на векторами
 */
public class Main {

    public static void main(String[] args) {

        Vector3D vector1 = new Vector3D();
        vector1.setX(11);
        vector1.setY(15);
        vector1.setZ(9);
        System.out.println("1 => " + vector1.toString());

        Vector3D vector2 = new Vector3D(8, 24, 16);
        System.out.println("2 => " + vector2.toString());

        System.out.println();

        System.out.println("Сложение векторов :");
        System.out.println(vector1.addVector(vector2));

        System.out.println();

        System.out.println("Векторное произведение : ");
        System.out.println(vector1.getVectorProduct(vector2));

        System.out.println();

        System.out.println("Скалярное произведение : " + vector1.getScalarProduct(vector2));

    }
}
