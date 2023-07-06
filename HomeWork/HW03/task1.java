package HomeWork.HW03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

// Задание 1
//  1.Пусть дан произвольный список целых чисел.
//   1) Нужно удалить из него чётные числа
//   2) Найти минимальное значение
//   3) Найти максимальное значение
//   4) Найти среднее значение

public class task1 {
    public static void main(String[] args) {
        int size = GetNumber("Enter size: ");
        int mavValue = GetNumber("Enter max value: ");
        ArrayList<Integer> myArrayList = ListRandomeNew(size, mavValue);
        PrintArray(myArrayList);
        // RemoveEvenInArray(myArrayList); // 1) Нужно удалить из него чётные числа
        PrintArray(myArrayList);
        System.out.printf("Min element = %d\n", Collections.min(myArrayList)); // 2) Найти минимальное значение
        System.out.printf("Max element = %d\n", Collections.max(myArrayList)); // 3) Найти максимальное значение
        System.out.printf("Avr element = %f\n", GetAverage(myArrayList)); // 3) Найти среднее значение

    }

    static ArrayList<Integer> ListRandomeNew(int size, int maxValue) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }

    static int GetNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // scanner.close();
        return num;
    }

    static void PrintArray(ArrayList aList) {
        for (int i = 0; i < aList.size() - 1; i++) {
            System.out.printf("%d, ", aList.get(i));
        }
        System.out.printf("%d.\n", aList.get(aList.size() - 1));
    }

    static void RemoveEvenInArray(ArrayList aList) {
        for (int i = 0; i < aList.size(); i++) {
            if ((Integer) aList.get(i) % 2 == 0) {
                aList.remove(i);
            }
        }
    }

    static double GetAverage(ArrayList<Integer> aList) {
        int sum =0;
        for (Integer object : aList) {
            sum += object;
        }
        return aList.size()>0 ? (double) sum / aList.size(): 0; // Тернарный оператоор: Если размер массива больше 0 то: sum / размер массива, иначе вернуть 0
    }
}
