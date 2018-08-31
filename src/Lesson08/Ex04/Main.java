package Lesson08.Ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(34);
        a.add(123);
        a.add(45);

        System.out.println("\nСписок : " + Arrays.toString(a.toArray()));

        System.out.println("\nИндекс : " + a.indexOf(123));

        System.out.println("\nИтераторы :");
        Iterator<Integer> itr = a.iterator();
        for (; itr.hasNext(); ) {

            System.out.println("элемент : " + itr.next());

        }
    }
}
