package Lesson05.Task04;

import Lesson03.Task03.Group;
import Lesson03.Task03.GroupFullException;

/*
модернизация класса - чтение данных о группе студентов из файла
и создать на их основе объект типа группа
 */
public class Main {

    public static void main(String[] args) {

        String srcFile = "out/groupData.txt";

        Group group = new Group();

        System.out.println("Чтение данных о группе из файла : ");

        try {

            // читаем данныем группы из файла
            System.out.println(group.loadGroup(srcFile) ? "Готово" : "Нет данных!");

        } catch (GroupFullException gfe) {

            gfe.getMessage();
        }

        System.out.println("\nСписок студентов в группе :\n" + group);

    }
}
