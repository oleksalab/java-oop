package Lesson03.Task02;

import Lesson03.Task01.Person;

/*
класс описывающий студента на основе класса человек и переопределить метод вывода информации
 */
public class Main {

    public static void main(String[] args) {

        Person john = new Student("John", 1980, "Kyiv", "KPI");

        System.out.println(john);

        System.out.println();

        Person mike = new Student("Mike", 1983, "Kyiv");
        ((Student) mike).setCollege("NAU");

        System.out.println(mike);

    }
}
