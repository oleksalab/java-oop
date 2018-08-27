package Lesson07.Ex01;

public class Notifier implements Runnable {

    private Message message;

    public Notifier(Message message) {

        this.message = message;
    }

    @Override

    public void run() {

        String name = Thread.currentThread().getName();

        try {

            Thread.sleep(3000);

            synchronized (message) {

                message.setMessage(name + " NOTIFIER запустился");

                /*
                 вариант #1

                for (int i = 0; i < Thread.activeCount(); i++) {

                    message.notify();
                }
                */

                // вариант #2
                message.notifyAll();
            }

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }
}
