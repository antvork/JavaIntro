package Lesson_05;

import java.util.*;

public class Ex003_HashMapBoost {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(30); // задаем размер коллекции
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f); // задаем размер коллекции и предел увеличения коллекции те 80%
    }
}