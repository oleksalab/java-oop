package Lesson06.Ex03;

public class Ex03Thread extends Thread {

    public Ex03Thread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }

}
