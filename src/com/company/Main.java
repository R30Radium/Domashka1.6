package com.company;

import java.util.Arrays;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        //Задание 1

        int[] allMoney = new int[30];
        int sum = 0;
        for (int r = 0; r < allMoney.length; r++) {
            allMoney[r] = (int) Math.round((Math.random() * 100_000) + 100_000);
            sum = sum + allMoney[r];

        }
        System.out.println("Сумма всех трат за месяц составила " + sum + " Рублей");

        //Задание 2

        int x = 2;
        int[] arrayMoney = new int[2];
        for (int i = 0; i < arrayMoney.length; i++) {
            arrayMoney[i] = (int) (Math.random() * 100_000 + 100_000);
        }
        int maximum = arrayMoney[0];
        int minimum = arrayMoney[0];
        int avg = 0;

        for (int z = 0; z < arrayMoney.length; z++) {
            if (maximum < arrayMoney[z])
                minimum = arrayMoney[z];
            if (maximum > arrayMoney[z])
                minimum = arrayMoney[z];
            avg = avg + arrayMoney[z] / arrayMoney.length;
        }
        System.out.println("Минимальная сумма трат за день составила " + minimum + " Рублей");
        System.out.println("Максимальная сумма трат за день составила " + maximum + " Рублей");

        //Задание 3

        float yy = 0f;
        for (float sumS : arrayMoney) {
            yy += sumS;
        }
        System.out.println("Средняя сумма трат за день составляет" + avg + " РУблей");

        //Задание 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) System.out.print(reverseFullName[i]);

    }
}

