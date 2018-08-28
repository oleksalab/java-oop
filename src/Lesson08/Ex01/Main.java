package Lesson08.Ex01;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Animal object1 = new Animal();
        Animal object2 = new Animal();

        System.out.println("Object 1 => " + object1.toString());
        System.out.println("Object 2 => " + object2.toString());

        object2 = object1;

        System.out.println("\nObject 2 => " + object2.toString());

        Animal object3 = (Animal) object1.clone();

        System.out.println("\nObject 3 => " + object3.toString());

        System.out.println("\nHashCode : " + object3.hashCode());

    }
}
