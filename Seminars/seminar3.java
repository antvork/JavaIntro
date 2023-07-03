package Seminars;
// 1. Заполнить список десятью случайными числами. N чисел

// Отсортировать список методом sort() и вывести его на экран.
// Ввод randome
// Вывод foreach и iterator

// 2. Заполнить список названиями планет 
// Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Lesson.lesson2.string;

public class seminar3 {

    public static void main(String[] args) {

        // Integer size = GetNumber("Enter size array: ");
        // Integer maxValue = GetNumber("Enter max value: ");
        // ListRandomeNew(size, maxValue);
        // Integer sizeArray = GetNumber("Enter size array: ");
        // planetCounter(sizeArray);
        createTable(3);

    }

    public static int GetNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // scanner.close();
        return num;
    }

    static void ListRandomeNew(int size, int maxValue) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        for (int item : list) {
            System.out.print(item + " ");
        }
        list.sort(Comparator.naturalOrder());

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.print(col.next() + " ");
        }

    }

    static void SortArray(List<Integer> list) {
        Collections.sort(list);
        // list.sort(Comparator.naturalOrder()); // 2 вариант
    }

    static void planetCounter(int n) {
        List<String> listPlanet = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune",
                "Pluto");
        List<String> randPlanets = new ArrayList<String>(n);
        int[] counts = new int[listPlanet.size()];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanet.get(rand.nextInt(listPlanet.size())));
            System.out.print(randPlanets.get(i) + " ");
            counts[listPlanet.indexOf(randPlanets.get(i))]++;

        }
        System.out.println();

        // for (String planet : randPlanets) {
        // counts[listPlanet.indexOf(planet)]++;
        // }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%s - %s\n", listPlanet.get(i), counts[i]);
        }

    }

    static void createTable(int size) {
        List<String> genres = List.of("Фантастика", "Коммедия", "Детектив", "Ужасы");
        List<ArrayList<String>> table = new ArrayList<>(genres.size());
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < genres.size(); i++) {
            ArrayList<String> booksOfGenre = new ArrayList<>(size);
            booksOfGenre.add(genres.get(i));
            System.out.printf("Input %d titles of %s genree down here: ", size, genres.get(i));
            for (int j = 0; j < size; j++)
                booksOfGenre.add(input.nextLine());

            table.add(booksOfGenre);
        }

        input.close();

        for (ArrayList<String> books : table) {
            for (String book : books) {
                System.out.print(book + " ");
            }
            System.out.println();
        }

    }
}
