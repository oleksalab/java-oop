package Lesson06.Ex04;

import java.util.Arrays;
import java.util.Random;

public class Main {

    /*
    TODO: посчитать производительность
    TODO: попробовать разное количество потоков
     */

    public static void main(String[] args) {

        long tstart;
        long tend;

        System.out.print("Создание исходных массивов : ");

        // формируем исходный массив
        int[] array = new int[200000];
        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10);
        }

        // делаем несколько копий исходного массива
        int[] array2 = array.clone();
        int[] array3 = array.clone();

        System.out.println("Готово!");

        System.out.println("\nСортировка разными методами :");

        // сортировка статическим методом
        System.out.print("- Статический\t= ");
        tstart = System.currentTimeMillis();
        sort(array);
        tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " мс");

        // сортировка многопоточным методом
        System.out.print("- Многопоточный\t= ");
        tstart = System.currentTimeMillis();
        MultiThreadSorting.sort(array2, 3);
        tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " мс");

        // сортировка системным методом
        System.out.print("- Системный\t\t= ");
        tstart = System.currentTimeMillis();
        Arrays.sort(array3);
        tend = System.currentTimeMillis();
        System.out.println((tend - tstart) + " мс");

    }

    private static void sort(int[] array) {

        int temp;

        for (int i = 1; i < array.length; i++) {

            int k = i - 1;
            temp = array[i];

            for (; k >= 0 && array[k] > temp; ) {
                array[k + 1] = array[k];
                array[k] = temp;
                k--;
            }
        }
    }
}
