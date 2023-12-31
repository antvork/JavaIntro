package Seminars;

import java.util.Scanner;

import java.time.LocalDateTime;

public class seminar1 {

    // 1.1 Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    // Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
    // 1.2 Добавить время суток

    // 2 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
    // количество подряд идущих 1.

    // 3 Задан массив, например, nums = [1,7,3,6,5,6].
    // Написать программу, которая найдет индекс i для этого массива такой, что
    // сумма элементов с индексами < i равна сумме элементов с индексами > i.

    // 4 Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном
    // порядке.

    public static void main(String[] args) {

        // helloUser();

        // quantityOfSame();

        // magicIndex();
        reversePhrase();

    }

    static void reversePhrase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your phrase:");
        String phrase = scanner.nextLine();
        String[] words = phrase.split(" ");
        String[] res = new String[words.length];
        
        for (int i = 0; i < words.length; i++) 
            res[i] = words[words.length - 1 - i];

        for (String word : res) {
            System.out.print(word + " ");
        }

        scanner.close();
    }

    static void magicIndex() {
        int[] array = new int[] { 1, 7, 3, 6, 5, 6 };

        for (int i = 1; i < array.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int i1 = 0; i1 < i; i1++)
                leftSum += array[i1];
            for (int i2 = i + 1; i2 < array.length; i2++)
                rightSum += array[i2];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

        }
        System.out.println(-1);

    }

    static void quantityOfSame() {
        int[] array = new int[] { 1, 1, 0, 1, 1, 1 };
        int maxCount = 0;
        int count = 0;

        for (int item : array) {
            if (item == 1)
                count++;
            else if (count > maxCount) {
                maxCount = count;
                count = 0;
            } else
                count = 0;
        }
        if (count > maxCount)
            maxCount = count;
        System.out.println(maxCount);
    }

    static void helloUser() {
        Scanner sc = new Scanner(System.in);
        int hour = LocalDateTime.now().getHour();

        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        String dayTime = "";

        if (hour >= 4 && hour < 11)
            dayTime = "morning";
        else if (hour >= 11 && hour < 17)
            dayTime = "day";
        else if (hour >= 17 && hour < 23)
            dayTime = "evening";
        else
            dayTime = "night";

        System.out.printf("Good %s, %s!", dayTime, name);
        sc.close();

    }
}
