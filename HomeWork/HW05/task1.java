package HomeWork.HW05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
//  их необходимо считать, как одного человека с разными телефонами.
//   Вывод должен быть отсортирован по убыванию числа телефонов.

public class task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 2222, bookPhone);
        addNumber("Ivanov", 3333, bookPhone);
        addNumber("Petrov", 22222, bookPhone);
        addNumber("Sidorov", 222333, bookPhone);
        addNumber("Ivanov", 333222, bookPhone);
        addNumber("Petrov", 112233, bookPhone);

        printBook2(bookPhone);

       
        
    }

    // Добавление в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    // Печать контактов

    static void printBook2(Map<String, ArrayList<Integer>> map){
         TreeMap<String, LinkedList<Integer>> resultMap = new TreeMap<>();

        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> arrayList = entry.getValue();
            LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
            resultMap.put(key, linkedList);
        }
        for (var item : resultMap.entrySet()) {
            System.out.printf("Surname %s tel. numbers =  %s. \n",item.getKey(), item.getValue());
        }
    }
}
