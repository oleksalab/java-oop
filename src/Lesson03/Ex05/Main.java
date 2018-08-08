package Lesson03.Ex05;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double a;

        for (; ; ) {

            try {

                a = Double.valueOf(JOptionPane.showInputDialog("Введите число с плавающей точкой"));

                break;

            } catch (NumberFormatException nfe) {

                JOptionPane.showMessageDialog(null, "Ошибка! Неверный формат данных");

                nfe.printStackTrace();

            } finally {

                JOptionPane.showMessageDialog(null, "Завершили итерацию цикла");
            }
        }

        System.out.println(a);
    }

}
