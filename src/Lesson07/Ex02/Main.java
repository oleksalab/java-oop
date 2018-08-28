package Lesson07.Ex02;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {

    static final int period = 100;

    public static void main(String[] args) {

        Runnable limitedCall = new Runnable() {

            final Random rand = new Random();

            Semaphore semaphore = new Semaphore(3);

            int counter = 0;
            int timer = rand.nextInt(10);

            @Override
            public void run() {

                counter++;

                try {

                    semaphore.acquire();

                    System.out.println("Execute " + timer + " sec");

                    Thread.sleep(timer * period);

                    System.out.println("Done at " + timer + " sec");

                    semaphore.release();

                } catch (InterruptedException ie) {

                    ie.printStackTrace();
                }
            }
        };

        for (int i = 0; i < 10; i++) {

            new Thread(limitedCall).start();
        }

    }
}
