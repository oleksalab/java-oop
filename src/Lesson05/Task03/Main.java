package Lesson05.Task03;

import Lesson03.Task02.Student;
import Lesson03.Task03.Group;
import Lesson03.Task03.GroupFullException;

/*
модернизация класса - сохранение данных о группе студентов в файл
 */
public class Main {

    public static void main(String[] args) {

        String groupFile = "out/groupData.txt";

        // создаём группу
        Group group = new Group();

        // добавляем студентов в группу
        System.out.println("Создание группы студентов");

        try {

            group.add(new Student("Олег", 2001, "Киев", "КПИ"));
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

        System.out.println("\nСписок студентов в группе :\n" + group);

        // сохранение данных в файл
        System.out.print("Сохраняем данные о группе в файл : ");
        group.saveGroup(groupFile);

        System.out.println("Готово!");
    }
}
