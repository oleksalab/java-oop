package Lesson01.Ex01;

public class Main {

    public static void main(String[] args) {

        Car volvo = new Car("Volvo");
        Car subaru = new Car("Subaru", 200);
        Car hummer = new Car("Hummer", 150, "black");

        System.out.println(volvo.toString());
        System.out.println(subaru.toString());
        System.out.println(hummer.toString());

        System.out.println();

        Car jeep = new Car();

        System.out.println(jeep.toString());

        jeep.setName("Jeep");
        jeep.setColor("Red");
        jeep.setSpeed(100);

        System.out.println(jeep.toString());

        System.out.println();

        jeep.setName("Lada");

        System.out.println(jeep.toString());

        System.out.println();

        System.out.println("Name : " + jeep.getName());
        System.out.println("Color : " + jeep.getColor());
        System.out.println("Speed : " + jeep.getSpeed());

    }
}
