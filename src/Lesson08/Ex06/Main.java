package Lesson08.Ex06;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        System.out.println("> of");

        Optional<String> text = Optional.of("name");

        System.out.println("Значение : " + text);
        System.out.println("Существует ли : " + text.isPresent());
        System.out.println("Get 1 : " + text.get());

        text = text.of("text");

        System.out.println("Get 2 : " + text.get());

        System.out.println();

        System.out.println("> ofNullable");

        Optional<String> text2 = Optional.ofNullable(null);

        System.out.println("Значение : " + text2);
        System.out.println("Существует ли : " + text2.isPresent());

        try {

            System.out.print("Get 1 : ");
            System.out.println(text2.get());

        } catch (NoSuchElementException nsee) {

            System.out.println("Нет такого элемента!");
        }

        text2 = text2.of("Hello");

        System.out.println("Get 2 : " + text2.get());

    }
}
