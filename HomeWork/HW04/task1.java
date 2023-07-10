package HomeWork.HW04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// Даны два Deque, представляющие два целых числа. 
// Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. 
// Одно или два числа должны быть отрицательными.

public class task1 {
    public static void main(String[] args) {

        Deque<Integer> dq1 = new LinkedList<Integer>(Arrays.asList(1, -2, 3));
        Deque<Integer> dq2 = new LinkedList<Integer>(Arrays.asList(4, 5, -6));
        LinkedList<Integer> multDeque = mult(dq1, dq2); // 1 Произведение
        // LinkedList<Integer> sumDeque = sum(dq1, dq2); // 2 Сумма

        System.out.println(multDeque);
        // System.out.println(sumDeque);

    }

    static LinkedList<Integer> mult(Deque<Integer> dq1, Deque<Integer> dq2) {
        String str1 = "";
        String str2 = "";
        LinkedList<Integer> result = new LinkedList<>();
        while (!dq1.isEmpty()) {
            int n = dq1.removeLast();
            if (n < 0) {
                n /= -1;
            }
            str1 += n;
        }
        while (!dq2.isEmpty()) {
            int n = dq2.removeLast();
            if (n < 0) {
                n /= -1;
            }
            str2 += n;
        }

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int mult = num1 * num2;
        while (mult != 0) {
            result.addFirst(mult % 10);
            mult /= 10;
        }
        return result;
    }

    static LinkedList<Integer> sum(Deque<Integer> dq1, Deque<Integer> dq2) {
        String str1 = "";
        String str2 = "";
        LinkedList<Integer> result = new LinkedList<>();
        while (!dq1.isEmpty()) {
            int n = dq1.removeLast();
            if (n < 0) {
                n *= -1;
            }
            str1 += n;
        }
        while (!dq2.isEmpty()) {
            int n = dq2.removeLast();
            if (n < 0) {
                n *= -1;
            }
            str2 += n;
        }

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int mult = num1 + num2;
        while (mult != 0) {
            result.addFirst(mult % 10);
            mult /= 10;
        }
        return result;
    }

}
