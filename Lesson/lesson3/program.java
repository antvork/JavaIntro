package Lesson.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class program {
    public static void main(String[] args) {
        // Коллекции
        // Массивы
        // // Как увеличить массив на 1 элемент
        // int[] a = new int[] { 1, 9 };
        // int[] b = new int[3];
        // System.arraycopy(a, 0, b, 0, a.length);
        // for (int i : a) {
        // System.out.printf("%d ", i);
        // } // 1 9
        // for (int j : b) {
        // System.out.printf("%d ", j);
        // } // 1 9 0

        // // Иерархия коллекций. ArrayList
        // ArrayList list = new ArrayList(); // сырые данные

        // ArrayList<Integer> list1 = new ArrayList<Integer>(); // определеный тип List
        // ArrayList<Integer> list2 = new ArrayList<>(10); // определеный тип List из 10 элементов
        // ArrayList<Integer> list3 = new ArrayList<>(list1); // определеный тип List создание из одной в другу коллекцию
        // list1.add(2809);

        // for (Object o : list1) {
        //     System.out.println(o);
        // }

        // add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        // get(pos) – возвращает элемент из списка по указанной позиции
        // indexOf(item) – первое вхождение или -1
        // lastIndexOf(item) – последнее вхождение или -1
        // remove(pos) – удаление элемента на указанной позиции и его возвращение
        // set(int pos, T item) – помещает значение item элементу, который находится на
        // позиции pos
        // void sort(Comparator) – сортирует набор данных по правилу
        // subList(int start, int end) – получение набора данных от позиции start до end
        // clear() – очистка списка
        // toString() – «конвертация» списка в строку
        // Arrays.asList – преобразует массив в список
        // containsAll(col) – проверяет включение всех элементов из col
        // removeAll(col) – удаляет элементы, имеющиеся в col
        // retainAll(col) – оставляет элементы, имеющиеся в col
        // toArray() – конвертация списка в массив Object’ов
        // toArray(type array) – конвертация списка в массив type
        // List.copyOf(col) – возвращает копию списка на основе имеющегося
        // List.of(item1, item2,...) – возвращает неизменяемый список

        // Итератор

        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        while (col.hasNext()) {
            System.out.println(col.next());

        }

    }

    // Object

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b); // Переводим переменные в double и обратно запаковываем в Object
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else
            return 0;
    }

    // Массивы
    // Как увеличить массив на 1 элемент
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

}
