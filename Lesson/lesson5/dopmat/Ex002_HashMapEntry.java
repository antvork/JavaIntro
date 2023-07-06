package Lesson_05;

import java.util.*;

public class Ex002_HashMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db); 

        for (var item : db.entrySet()) { ///получаем итератор для передора
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue()); // выводим ключ значение
        }
    }
}