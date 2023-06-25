package HomeWork.HW01;

import java.util.Scanner;
//  1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task1 {

    public static void main(String[] args) {
        int trnum = GetNumber("Enter number: ");
        System.out.printf("Triangle nummber: %d = %d \n", trnum, TriangleNumber(trnum));
        System.out.printf("Factoriall number: %d = %d \n", trnum, Factoriall(trnum));
        System.out.printf("The product of numbers from 1 to %d = %s", trnum, PrductIn1(trnum));

    }

    public static int GetNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static int TriangleNumber(Integer a) {
        int res = (a * (a + 1)) / 2;
        return res;
    }

    public static int Factoriall(int a) {
        if (a == 1)
            return 1;
        else
            return a * Factoriall(a - 1);
    }

    public static String PrductIn1(int a) {
        String res = "\n";
        for (int i = 1; i <= a; i++) {
            res +=a + " * " + i + " = " + a * i + "\n";
        }
        return res;
    }

}
