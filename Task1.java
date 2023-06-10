package org.example;

import java.util.Scanner;

public class Task1 {

    /*
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    public static void main(String[] args) {
        toFloat();
    }

    private static float toFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите вещественное число ");
                String data = scanner.nextLine();
                return Float.parseFloat(data);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода данных");
            }
        }
    }
}
