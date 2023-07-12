package HomeWork.HW04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// Даны два Deque, представляющие два целых числа. 
// Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 2) Сложите два числа и верните сумму в виде связанного списка. 
// Одно или два числа должны быть отрицательными.

public class task2 {
    public static void main(String[] args) {

        Deque<Integer> dq1 = new LinkedList<Integer>(Arrays.asList(3, 9, -5));
        Deque<Integer> dq2 = new LinkedList<Integer>(Arrays.asList(4, 5, -6));
   
        Deque<Integer> multDeque = sum2(dq1, dq2);

        System.out.println(multDeque);
    

    }




    static Deque<Integer> sum2(Deque<Integer> dq1, Deque<Integer> dq2){
        Deque<Integer> res = new LinkedList<>();
        int dm = 0;
        while (!dq1.isEmpty() || !dq2.isEmpty()) {
            int m = dq1.removeLast() + dq2.removeLast() + dm;
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
