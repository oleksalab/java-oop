package Lesson07.Ex01;

public class Main {

    public static void main(String[] args) {

        Message message = new Message("START");


        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1, "WAITER-1").start();

        Waiter waiter2 = new Waiter(message);
        new Thread(waiter2, "WAITER-2").start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier, "NOTIFIER").start();


        System.out.println("Все потоки запущены");
    }
}
