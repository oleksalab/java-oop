package Lesson07.Ex01;

public class Waiter implements Runnable {

    private Message message;

    public Waiter(Message message) {

        this.message = message;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        synchronized (message) {

            try {

                System.out.println(name + " ждём notify");

                message.wait();

            } catch (InterruptedException ie) {

                ie.printStackTrace();
            }

            System.out.println(name + " вызван notify");

            System.out.println(name + " > " + message.getMessage());
        }
    }
}
