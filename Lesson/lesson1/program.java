import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program { // Начало программы

    static String getType(Object o) { // Метод для проверки типа данных
        return o.getClass().getSimpleName();
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    public static void main(String[] args) { // Точка входа

        // System.out.println("Bue world!"); // Вывод текста
        // String s = null;
        // System.out.println(s);
        // short age = 10;
        // int salary = 123654;
        // float f = 12.45f;
        // double d = 13.46;

        // // ЛОГИЧЕСКИЕ ТИПЫ ДАННЫХ
        // boolean flag1 = 123 <= 234;
        // System.out.println(flag1);
        // boolean flag2 = 123 >= 234 || flag1; // И
        // System.out.println(flag2);
        // boolean flag3 = flag1 ^ flag1; // ИЛИ
        // System.out.println(flag3);

        // НЕЯВНАЯ ТИПИЗАЦИЯ
        var i = 123;
        System.out.println(i);
        var d = 123.321654;
        System.out.println(d);
        System.out.println(getType(i));
        System.out.println(getType(d));

        // КЛАССЫ ОБЕРТКИ
        // int i = 123_123_6545;
        // System.out.println(Integer.MAX_VALUE); // Чтобы обратиться к объекту int
        // нужно указать полное наименование типа объекта
        // System.out.println(Integer.MIN_VALUE);
        // String s = "qwer"
        // s.charAt(0) // Обращение к символам

        // ОПЕРАЦИИ
        // int a = 123;
        // a++; // Инкримент
        // System.out.println(a);
        // System.out.println(a++); //Постфиксный инкримент
        // System.out.println(a);
        // System.out.println(++a); // Префиксный инкримент
        // a = a-- - --a;
        // a = --a - a--;
        // System.out.println(a);

        // int a = 8;
        // // 1000
        // a = a << 1; // Побитовый сдвиг
        // //10000
        // System.out.println(a);
        // ###
        // int a = 5;
        // int b = 2;
        // System.out.println(a | b); // Побитовый ИЛИ
        // // 101
        // // 010
        // // 111
        // int a = 5;
        // int b = 2;
        // System.out.println(a & b); // Побитовый И
        // // 101
        // // 010
        // // 000

        // ### МАССИВЫ
        // int[] arr = new int[10];
        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length);
        // System.out.println(arr[3]);
        // arr[3] = 13;

        // ### Многомерные массивы
        // int[] arr[] = new int[3][5];
        // int[][] arr2 = new int [3][5]; // Двумерные массивы
        // for (int[] line: arr){
        // for (int item : line){
        // System.out.printf("%d", item);
        // }
        // System.out.println();
        // }

        // int[][] arr = new int[3][5]; // ДВУМЕРНЫй Массив (Массивы массивов)

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.printf("%d ", arr[i][j]);
        // }
        // System.out.println();
        // }

        // ## ПРЕОБРАЗОВАНИЯ
        // int i = 123; double d = i;
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0
        // d = 3.1415; i = (int)d;
        // System.out.println(d); // 3.1415
        // System.out.println(i); // 3
        // d = 3.9415; i = (int)d;
        // System.out.println(d); // 3.9415
        // System.out.println(i); // 3
        // byte b = Byte.parseByte("123");
        // System.out.println(b); // 123
        // b = Byte.parseByte("1234"); //Преобразование из строки в байты
        // System.out.println(b); // NumberFormatException: Value out of range

        // #### Получение данных из терминала
        // Строки
        // import java.util.Scanner;

        // Scanner iScanner = new Scanner(System.in); // Получаем экземпляр класса
        // сканер
        // System.out.printf("name: ");
        // String name = iScanner.nextLine(); //Получение строки
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();

        // ### Некоторые примитивы
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt(); // Получение числв
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble(); // Получение float числа
        // System.out.printf("%d + %f = %f", x, y, x + y); // Представление знаений как
        // в Функции
        // iScanner.close();

        // ### Проверка на соответствие получаемого типа
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        // ### Форматированный вывод
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c; // Контатинация строк
        // System.out.println(res);

        //

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);

        // ### Виды спецификаторов/маски
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений

        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3,141500
        // System.out.printf("%.2f\n", pi); // 3,14 // 2 знака после запятой
        // System.out.printf("%.3f\n", pi); // 3,141
        // System.out.printf("%e\n", pi); // 3,141500e+00
        // System.out.printf("%.2e\n", pi); // 3,14e+00
        // System.out.printf("%.3e\n", pi); // 3,141e+00

        // ### Область видимости переменных

        // {
        // int i = 123;
        // System.out.println(i);
        // }
        // System.out.println(i); // error: cannot find symbol

        // ### Функции и методы

        // lib.sayHi(); // Подключение библиотеки с функцией
        // System.out.println(sum(1, 3)); // 4
        // System.out.println(factor(5)); // 120.0

        // ### Управляющие конструкции:
        // условный оператор

        // int a = 1;
        // int b = 2;
        // int c;
        // if (a > b) {
        // c = a;
        // } else {
        // c = b;
        // }
        // System.out.println(c);

        // Упрощенный вариант

        // int a = 1;
        // int b = 2;
        // int c = 0;
        // if (a > b) c = a;
        // if (b > a) c = b;
        // System.out.println(c);

        // тернарный оператор (обязательно что-то вернется)
        // int a = 1;
        // int b = 2;
        // int min = a < b ? a : b; // если а меньше b то вернется a если нет то b
        // System.out.println(min);

        // Оператор выбора / РАЗОБРАТЬ

        // switch (key) {
        // case value:

        // break;

        // default:
        // break;
        // }

        // ### Циклы
        // // while
        // int value = 321;
        // int count = 0;
        // while (value != 0) {
        // value /= 10;
        // count++;
        // }
        // System.out.println(count);

        // // do while

        // int value = 321;
        // int count = 0;
        // do {
        // value /= 10;
        // count++;
        // } while (value != 0);
        // System.out.println(count);

        // // for

        // int s = 0;
        // for (int i = 1; i <= 10; i++) {
        // s += i;
        // }
        // System.out.println(s);

        // continue, break
        // Операторы для управления циклами — continue и break.
        // Выполнение следующей итерации цикла — continue.
        // Прерывание текущей итерации цикла — break.
        // * ближайшего к оператору
        // continue
        // for (int i = 0; i < 10; i++) { //1 3 5 7 9
        // if (i % 2 == 0) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // break

        // for (int i = 0; i < 10; i++) { // 0
        //     if (i % 2 != 0) {
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // for:
        // Работает только для коллекций
        // int arr[] = new int[] { 1, 2, 3, 4, 8, 99, 55 };
        // for (int item : arr) {
        // System.out.printf("%d ", item);
        // }
        // System.out.println();

        // ### Работа с файлами
        // import java.io.FileWriter;
        // import java.io.IOException;

        // Создание и запись\ дозапись

        // try (FileWriter fw = new FileWriter("file.txt", false)) {
        //     fw.write("line 1");
        //     fw.append('\n');
        //     fw.append('2');
        //     fw.append('\n');
        //     fw.write("line 3");
        //     fw.flush();
        // } catch (IOException ex) {
        //     System.out.println(ex.getMessage());
        // }

        // Чтение, Вариант посимвольно

        // import java.io.*;
        // public static void main(String[] args) throws Exception { <<--- Добавляем в в класс main
        // FileReader fr = new FileReader("file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        //     char ch = (char) c;
        //     if (ch == '\n') {
        //         System.out.print(ch);
        //     } else {
        //         System.out.print(ch);
        //     }
        // }

        // Вариант построчно

        // // public static void main(String[] args) throws Exception {  <<--- Добавляем в в класс main
        // BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        // String str;
        // while ((str = br.readLine()) != null) {
        //     System.out.printf("== %s ==\n", str);
        // }
        // br.close();




    }
}

/*
 * Коментарии
 */
