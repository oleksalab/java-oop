package Lesson08.Ex05;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Compare> set = new TreeSet<>();

        set.add(new Compare("Начальная школа", 10));
        set.add(new Compare("Начальная школа", 20));
        set.add(new Compare("Средняя школа", 30));
        set.add(new Compare("Высшая школа", 40));
        set.add(new Compare("Музыкальная школа", 50));
        set.add(new Compare("Средняя школа", 60));
        set.add(new Compare("Высшая школа", 70));

        for (Compare item : set) {

            System.out.println(item.toString());
        }

    }
}
