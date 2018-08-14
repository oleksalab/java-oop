package Lesson03.Ex08;

public class Main {

    public static void main(String[] args) {

        try {

            System.out.println(sum(3, 4));
            System.out.println(sum(5, 6));

        } catch (MyCustomException mce) {

            System.out.println(mce.getMessage());
        }
    }

    static int sum(int a, int b) throws MyCustomException {

        if (a == 5) throw new MyCustomException();

        return a + b;
    }

}
