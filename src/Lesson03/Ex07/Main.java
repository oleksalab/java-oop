package Lesson03.Ex07;

public class Main {

    public static void main(String[] args) {

        try {

            System.out.println(sum(3, 4));
            System.out.println(sum(5, 6));

        } catch (IllegalAccessException e) {

            System.out.println("Interception thrown");
        }
    }

    static int sum(int a, int b) throws IllegalAccessException {

        if (a == 5) throw new IllegalAccessException();

        return a + b;
    }

}
