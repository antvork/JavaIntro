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


public class task1 {
    public static void main(String[] args) {

        Deque<Integer> dq1 = new LinkedList<Integer>(Arrays.asList(3, 2, 3));
        Deque<Integer> dq2 = new LinkedList<Integer>(Arrays.asList(5, 5, 6));

        Deque<Integer> multDeque = mult2(dq1, dq2);

        System.out.println(multDeque);


    }

    static Deque<Integer> mult2(Deque<Integer> dq1, Deque<Integer> dq2) {
        Deque<Integer> res = new LinkedList<>();
        int dm = 0;
        while (!dq1.isEmpty() || !dq2.isEmpty()) {
            int m = dq1.removeLast() * dq2.removeLast() + dm;
            dm = 0;
            if (m > 9 || m < -9) {
                dm = m / 10;
                m = m % 10;
            }
            res.addFirst(m);
        }
        if(dm != 0) res.addFirst(dm);
        return res;
    }

    
}
