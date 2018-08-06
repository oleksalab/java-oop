package Lesson01.Task04;

import java.util.Arrays;

/*
класс с описанием телефона и мобильной сети, и методы для регистрации в сети и звонок другому абоненту
 */
public class Main {

    public static void main(String[] args) {

        // создаём мобильную сеть, ресурс сети - 10 телефонов
        Network network = new Network("GSM", 10);

        System.out.println("Название сети : " + network.getName());

        // "включились" новые телефоны
        Phone phone1 = new Phone("0671234578");
        Phone phone2 = new Phone("0672135487");
        Phone phone3 = new Phone("0673216576");

        // регистрируем эти телефоны в нашей сети
        network.registerPhone(phone1);
        network.registerPhone(phone2);
        network.registerPhone(phone3);

        // включаем и регистрируем свой телефон в сети
        Phone myPhone = new Phone("0673334455");
        network.registerPhone(myPhone);

        System.out.println("Список телефонов в сети :");
        Phone[] phones = network.getPhones();
        System.out.println(Arrays.toString(phones));

        System.out.println();

        // звонок на один из номеров "online"
        showCallLog(network.call(myPhone, phone2));

        System.out.println();

        // звонок на некий номер - "offline"
        showCallLog(network.call(myPhone, new Phone("0679998877")));

    }

    private static void showCallLog(boolean callStatus) {

        System.out.print("Статус : ");

        if (callStatus) {

            System.out.println("Успешно! Телефон в сети!");

        } else {

            System.out.println("Ошибка! Телефон не в сети");
        }
    }
}
