package HomeWork.HW01;

import java.util.Scanner;

// 2) Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {

        int userNumber = GetNumber("Enter number: ");

        for (int i = 0; i < userNumber; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }

    }

    ///////
    public static int GetNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static boolean isPrime(int number) { // Проверка является ли число простым
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
