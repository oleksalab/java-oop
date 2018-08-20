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

        System.out.println("Чтение данных о группе из файла : ");

        Group group = new Group();

        try {
            // читаем данныем группы из файла
            group.loadGroup(srcFile);

            System.out.println("Готово!");

        } catch (GroupFullException gfe) {

            gfe.getMessage();
        }

        System.out.println("\nСписок студентов в группе :\n" + group);

    }
}
