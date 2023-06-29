package Lesson.lesson2;

import java.util.Arrays;
import java.util.List;

public class string {
    public static void main(String[] args) {
        // String s = "I love movies";

        // Human max = new Human("Макс");
        // String out = "Java объект: " + max;
        // System.out.println(out);

        // // Сравнение строк

        // String x = "Test String";
        // System.out.println("Test String".equals(x));
        // // Когда при сравнении строк нам не важен регистр, нужно использовать метод
        // equalsIgnoreCase()
        // String x = "Test String";
        // System.out.println("test string".equalsIgnoreCase(x));

        // Перевод объекта/примитива в строку String.valueOf()

        // String a = String.valueOf(1);
        // String b = String.valueOf(12.0D);
        // String c = String.valueOf(123.4F);
        // String d = String.valueOf(123456L);
        // String s = String.valueOf(true);
        // String human = String.valueOf(new Human("Alex"));

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(s);
        // System.out.println(human);

        // Перевод строки в число

        // Integer i = Integer.parseInt("12");
        // Double d = Double.parseDouble("12.65D");

        // System.out.println(i); // 12
        // System.out.println(d); // 12.65

        // Перевод коллекции строк к строковому представлению

        // List<String> people = Arrays.asList(
        // "Philip J. Fry",
        // "Turanga Leela",
        // "Bender Bending Rodriguez",
        // "Hubert Farnsworth",
        // "Hermes Conrad",
        // "John D. Zoidberg",
        // "Amy Wong"
        // );

        // String peopleString = String.join("; ", people);
        // System.out.println(peopleString);
        // /*
        // Вывод:
        // Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth;
        // Hermes Conrad; John D. Zoidberg; Amy Wong
        // */

        // Разбиение строки на массив строк split(String regex)

        // String people = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth; Hermes Conrad; John D. Zoidberg; Amy Wong";

        // String[] peopleArray = people.split("; ");
        // for (String human : peopleArray) {
        // System.out.println(human);
        // }

        // Определение позиции элемента в строке

        // String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // System.out.println(alphabet.indexOf('A')); // 0
        // System.out.println(alphabet.indexOf('K')); // 10
        // System.out.println(alphabet.indexOf('Z')); // 25
        // System.out.println(alphabet.indexOf('Я')); // -1

        // Извлечение подстроки из строки

        // String filePath = "D:\\Movies\\Futurama.mp4";
        // int lastFileSeparatorIndex = filePath.lastIndexOf('\\');
        // String fileName = filePath.substring(lastFileSeparatorIndex + 1);
        // System.out.println(fileName); //Futurama.mp4

        // Перевод строки в верхний/нижний регистр:
        // toLowerCase()
        // toUpperCase()

        // String fry = "Philip J. Fry";

        // String lowerCaseFry = fry.toLowerCase();
        // String upperCaseFry = fry.toUpperCase();

        // System.out.println(lowerCaseFry); // philip j. fry
        // System.out.println(upperCaseFry); // PHILIP J. FRY

        // ////////////////////////////////////////////////////////

        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

    }



    static class Human {
        private String name;

        public Human(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Человек с именем " + name;
        }
    }
}
