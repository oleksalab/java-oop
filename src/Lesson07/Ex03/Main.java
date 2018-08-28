package Lesson07.Ex03;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable runnable = new Runnable() {

            @Override
            public void run() {

                System.out.println("PING");
            }
        };

        scheduler.scheduleAtFixedRate(runnable, 5,5, TimeUnit.SECONDS);

    }
}
