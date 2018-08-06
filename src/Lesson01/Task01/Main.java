package Lesson01.Task01;

/*
описать класс со свойствами и методами, создать несколько его экземпляров
 */
public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setName("Мурзик");
        cat1.setKind("Сиамский");
        cat1.setWeight(3.5);
        cat1.setAge(5);

        System.out.println("1 => Cat :");
        System.out.println("Кличка : " + cat1.getName());
        System.out.println("Порода : " + cat1.getKind());
        System.out.println("Вес : " + cat1.getWeight() + " кг");
        System.out.println("Возраст : " + cat1.getAge() + " лет");

        System.out.println();

        Cat cat2 = new Cat("Барсик");
        cat2.setKind("Бельгийский");

        System.out.println("2 => " + cat2.toString());

        System.out.println();

        Cat cat3 = new Cat("Персик", "Персидский", 2.4,2);
        System.out.println("3 => " + cat3.toString());
    }
}
