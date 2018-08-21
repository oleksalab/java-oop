package Lesson06.Ex02;

public class Ex02Thread implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName() + " - " + i);
        }

    }
}
