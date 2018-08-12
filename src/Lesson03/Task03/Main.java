package Lesson03.Task03;

import Lesson03.Task02.Student;

/*
класс описывающий группу из 10 студентов с методами добавления и удаления студентов,
с генерацией исключения при добавлении больше 10 студентов в группу
а также вывод информации о группе в алфавитном порядке
 */
public class Main {

    public static void main(String[] args) {

        // создаём группу
        Group group = new Group();

        // добавляем студентов в группу
        System.out.println("Создание группы студентов");

        try {

            group.add(new Student("Олег", 2000, "Киев", "КПИ"));
            group.add(new Student("Иван", 1999, "Киев", "КПИ"));
            group.add(new Student("Миша", 2001, "Львов", "КПИ"));
            group.add(new Student("Оля", 2001, "Львов", "КПИ"));
            group.add(new Student("Катя", 2000, "Харьков", "КПИ"));
            group.add(new Student("Вова", 2001, "Одесса", "КПИ"));
            group.add(new Student("Рома", 2000, "Киев", "КПИ"));
            group.add(new Student("Коля", 2001, "Киев", "КПИ"));
            group.add(new Student("Люда", 2000, "Харьков", "КПИ"));
            group.add(new Student("Боря", 2000, "Киев", "КПИ"));

        } catch (GroupFullException gfe) {

            System.out.println(gfe.getMessage());
        }

        System.out.println();
        System.out.println("Список студентов в группе :\n" + group);


        // удаляем студента из группы
        System.out.println("Удаление 2-x студентов из группы (один есть в группе, другого - нет)");

        try {

            group.remove(new Student("Иван", 1999, "Киев", "КПИ"));
            group.remove(new Student("Глеб", 2001, "Одесса", "КПИ"));

        } catch (UnknownStudentException use) {

            System.out.println(use.getMessage());
        }

        System.out.println();
        System.out.println("Список студентов в группе :\n" + group);


        // добавляем новых студентов в группу
        System.out.println("Добавление 2-x студентов в группу (свободно только одно место)");

        try {

            group.add(new Student("Аня", 2001, "Киев", "КПИ"));
            group.add(new Student("Гриша", 2000, "Киев", "КПИ"));

        } catch (GroupFullException gfe) {

            System.out.println(gfe.getMessage());
        }

        System.out.println();
        System.out.println("Список студентов в группе :\n" + group);

    }


}
