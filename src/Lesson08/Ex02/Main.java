package Lesson08.Ex02;

public class Main {

    public static void main(String[] args) {

        new Thread() {

            {
                this.setDaemon(true);
            }

            public void run() {

                while (true) {

                    System.out.println("Thread is running!");
                }
            }
        }.start();

    }
}
