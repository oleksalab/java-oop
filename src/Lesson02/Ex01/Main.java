package Lesson02.Ex01;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(3, 4, true, "milk");

        Cat cat1 = new Cat(5, 3.5, true, "Молоко", "Мурзик", "Сиамский");
        System.out.println("Cat1 : " + cat1);

        Cat cat2 = new Cat(3, 4, true, "milk", "Барсик", "Амурский");
        System.out.println("Cat2 : " + cat2);

        Cat cat3 = new Cat(5, 7, true, "мясо", "Маркиз", "Амурский");
        System.out.println("Cat3 : " + cat3);

        System.out.println();

        voice(cat2);
        animal = cat2;
        voice(animal);

        System.out.println();

        System.out.println("Animal : " + animal);

        System.out.println();

        System.out.print(cat1.name + " и " + cat2.name + " - ");

        if (cat1.equals(cat2)) {

            System.out.println("Коты одинаковы!");

        } else {

            System.out.println("Коты разные!");
        }

        System.out.print(cat2.name + " и " + cat3.name + " - ");

        if (cat2.equals(cat3)) {

            System.out.println("Коты одной породы!");

        } else {

            System.out.println("Коты разной породы!");
        }

    }

    public static void voice(Animal a) {
        a.getVoice();
    }

}
